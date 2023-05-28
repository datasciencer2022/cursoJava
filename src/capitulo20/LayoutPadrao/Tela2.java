/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo20.LayoutPadrao;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Tela2 {
    private Frame tela;
	private Label lblNome, lblEmail;
	private TextField txtNome, txtEmail;
	private Button btnSalvar, btnExibir;

	private Panel painel;
	
	public Tela2(String titulo) {
		tela = new Frame(titulo);
		lblNome = new Label("Nome: ");
		lblEmail = new Label("Email: ");
		txtNome = new TextField(20);
		txtEmail = new TextField(20);
		btnSalvar = new Button("Salvar");
		btnExibir = new Button("Exibir");
		painel = new Panel();
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
		tela.add(painel);
		tela.pack();
		tela.setVisible(true);

	}
	public static void main(String[] args) {
		Tela2 telinha = new Tela2("Novo Livro");
	}

}
