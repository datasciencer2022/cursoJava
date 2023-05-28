package capitulo11.exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Atleta {

	public int codigo;
	public String nome;
	public String esporte;
	public double valorPatrocinio;
	
	public double atualizarValor (double taxa) {
		this.valorPatrocinio += this.valorPatrocinio * taxa /100;
		return this.valorPatrocinio;
	}
	
	public void mostrar() {
		String mensagem = "Objeto atleta criado a partir da classe Atleta";
		mensagem += "\nCódigo: "+ this.codigo;
		mensagem += "\nNome: "+ this.nome;
		mensagem += "\nEsporte: "+ this.esporte;
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		mensagem += "\nValor de Patrocínio: " + formatar.format(this.valorPatrocinio);
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
}