package capitulo20.LayoutPadrao.exercicios;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CopiaDeTela2{

	private JFrame tela;
	private JLabel lblNome, lblEmail;
	private JTextField txtNome, txtEmail;
	private JButton btnSalvar, btnExibir;

	private JPanel painel;
	
	public CopiaDeTela2(String titulo) {
		tela = new JFrame(titulo);
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
		tela.getContentPane().add(painel);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.pack();
		tela.setVisible(true);

	}
	public static void main(String[] args) {
		CopiaDeTela2 telinha = new CopiaDeTela2("Novo Livro");
	}
}