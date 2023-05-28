/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo20.LayoutPadrao;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author camila.ceccatto
 */
public class CopiaDeTela extends JFrame {
    private JLabel lblNome, lblEmail;
	private JTextField txtNome, txtEmail;
	private JButton btnSalvar, btnExibir;

	private JPanel painel;
	
	public CopiaDeTela(String titulo) {
		super(titulo);
		lblNome = new JLabel("Nome: ");
		lblEmail = new JLabel("Email: ");
		txtNome = new JTextField(20);
		txtEmail = new JTextField(20);
		btnSalvar = new JButton("Salvar");
		btnExibir = new JButton("Exibir");
		painel = new JPanel();
		
		//FlowLayout() é o gerenciador de layout padrão
		//É ele que é assumido quando nenhum gerenciador for escolhido
		//Ele coloca os objetos em uma linha
		painel.setLayout(new FlowLayout());
		
		painel.add(lblNome);
		painel.add(txtNome);	
		painel.add(lblEmail);
		painel.add(txtEmail);
		painel.add(btnSalvar);
		painel.add(btnExibir);
		this.getContentPane().add(painel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
	}
	public static void main(String[] args) {
		CopiaDeTela tela = new CopiaDeTela("Segundo Livro");
		tela.setVisible(true);			
	}

}
