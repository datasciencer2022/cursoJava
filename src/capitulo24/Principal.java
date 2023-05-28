/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo24;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import org.jdom2.JDOMException;

/**
 *
 * @author camila.ceccatto
 */
public class Principal extends JDialog implements ActionListener{
    private JLabel lblNome, lblEmail;
	private JTextField txtNome, txtEmail;
	private JButton btnSalvar, btnExibir, btnLimpar, 
					btnVoltar, btnImportar, btnExportar;
        // aqui foram adicionados os botões btnImportar e btnExportar

	private JPanel painel;
	
	private boolean verificarEmail() {
            /* Nesse método tem-se uma caricatura de uma verificação
             * de email (conferindo apenas se ele contém um arroba (@).
             * O leitor pode adicionar novas verificações quando quiser
             * seguindo a lógica desse modelo.
             */
		boolean resp = false;
		if (txtEmail.getText().contains("@")) {
			resp = true;
		}
		return resp;
	}
	
	public Principal(JFrame frame,String titulo,boolean modal) {
		super(frame,titulo,modal);
		//criando a janela como JDialog e colocando true em modal,
		//fica impossível retornar ao menu sem fechar essa janela
		
		lblNome = new JLabel("Nome: ");
		lblEmail = new JLabel("Email: ");
		txtNome = new JTextField(20);
		txtEmail = new JTextField(20);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		
		btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(this);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(this);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(this);

                /*
                 * Abaixo está a criação dos dois novos botões
                 * (para a manipulação do XML) que serão adicionados
                 * ao painel e, consequentemente, à janela.
                 * Também vemos em ambos a instrução que os associa 
                 * aos Listeners.
                 * Nota importante: quando a própria classe gráfica 
                 * implementa a interface ActionListener, ao adicioná-los
                 * basta a palavra chave this.
                 */
		btnImportar = new JButton("Importar XML");
		btnImportar.addActionListener(this);
		
		btnExportar = new JButton("Exportar XML");
		btnExportar.addActionListener(this);

		painel = new JPanel();
		
                /*
                 * o Layout Manager (Gerenciados de Layout) 
                 * escolhido foi o GridLayout(5,2) e note que
                 * nesse capítulo foi adicionada uma linha para
                 * os novos botões.
                 */
		painel.setLayout(new GridLayout(5,2));

		painel.add(lblNome);
		painel.add(txtNome);	
		painel.add(lblEmail);
		painel.add(txtEmail);
		painel.add(btnSalvar);
		painel.add(btnExibir);
		painel.add(btnLimpar);
		painel.add(btnVoltar);
		painel.add(btnImportar);
		painel.add(btnExportar);
		
		
		this.getContentPane().add(painel);
                
                /*
                 * Na linha abaixo, a configuração de ação 
                 * ao fechar a janela é a constante DISPOSE_ON_CLOSE.
                 * E ela foi escolhida pois queremos apenas fechar 
                 * essa JDialog e voltar ao menu da aplicação (quando 
                 * desejado). 
                 * Ou seja, a palavra DISPOSE não encerra a aplicação
                 * inteira como faria EXIT_ON_CLOSE.
                 */
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setLocation(100,100);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Contato meuContato=null;
		
		if (e.getSource() == btnExibir) {
			JOptionPane.showMessageDialog(this, Contato.getMinhaLista());
		}
		else if(e.getSource()==btnSalvar){  // no caso de haver clicado em Salvar:
			//Cria o objeto do tipo contato:
			meuContato = new Contato();
			
			//Popula o objeto:
			meuContato.setNome(txtNome.getText());
			meuContato.setEmail(txtEmail.getText());
			
			/* Adiciona à lista de Contatos caso a caixa
                         * de texto do Nome não esteja vazia.
                         */
			if (!txtNome.getText().isEmpty()) { 
                            
				if (verificarEmail()) {
					Contato.adiciona(meuContato);					
					JOptionPane.showMessageDialog(this, "Contato: "+txtNome.getText()+" adicionado com sucesso!");
				}
				else {
					JOptionPane.showMessageDialog(this,"Esse email não é válido. Contato não adicionado.");
				}
			}
                        else {
                            try {
                                throw new MinhaExcecao();
                            } catch (MinhaExcecao ex) {
                                System.out.println (ex.getMessage());
                            }
                        }
			
			//Desfaz o objeto meuContato:
			meuContato = null;
		}
		else if(e.getSource()==btnLimpar) {
			txtNome.setText(null);
			txtEmail.setText(null);
		}
		else if(e.getSource()==btnVoltar) {
	
			int confirma = JOptionPane.showConfirmDialog(this, "Quer excluir os contatos?", "Capítulo V", JOptionPane.YES_NO_OPTION);
			
			if (confirma==JOptionPane.YES_OPTION) {
				Contato.limpar();
			}

			this.setVisible(false);				
		}
		else if (e.getSource()==btnImportar) {
			System.out.println("Implementar importação");
                        /* Bloco try...catch() usado para tratar a 
                         * exceção a que está sujeito o código (declarada
                         * pelo throws no arquivo TrabalharXML.java.
                         * E que são decorrentes de erros como por exemplo
                         * se alguém apagar o arquivo XML do diretório 
                         * especificado, ou se estiver corrompido.
                         */
			try {
				TrabalharXML.lerXML();
			} catch (JDOMException e1) {
                            /* Caso seja disparada uma exceção do tipo
                             * JDOMException, a mesma será tratada aqui
                             * com o nome de objeto e1 e será mostrada sua
                             * mensagem original.
                             * */
                                System.out.println(e1.getMessage());
			} catch (IOException e1) {
                            /* Já se houver uma exceção de Entrada e Saída
                             * seu tratamento se dará aqui. Esse método
                             * printStackTrace do objeto e1 mostra a 
                             * sequência dos códigos envolvidos com a exceção.
                             */
				e1.printStackTrace();
			}
		}

		else if (e.getSource()==btnExportar) {
			System.out.println("Implementar Exportação");
			try {
				TrabalharXML.escreverXML();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
