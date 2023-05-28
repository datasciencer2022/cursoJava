package capitulo17.exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Livro extends Produto {

	public void exibirDados() {
		String mensagem = "Classe Livro é filha de Produto";
		mensagem += "\nCódigo: "+ this.getCodigo();
		mensagem += "\nDescrição: "+ this.getDescricao();
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		mensagem += "\nPreço: " + formatar.format(this.getPreco());
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
}