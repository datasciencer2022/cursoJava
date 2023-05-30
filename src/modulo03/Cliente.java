package modulo03;

import javax.swing.JOptionPane;

public class Cliente {
	private String nome;
	private int idade;
	private double altura;
	
	
	public void entrarDados() {
		this.nome = JOptionPane.showInputDialog("Digite seu nome: ");
		this.idade = Integer.parseInt(
				JOptionPane.showInputDialog("Digite sua idade: "));;
	
		this.altura = Double.parseDouble(
					JOptionPane.showInputDialog("Digite sua altura: "));;
	}
	
	public void mostrar() {
		String mensagem = this.nome +
				" tem "+ this.idade +
				" anos e mede "+ this.altura +
				" metros.";
		
		JOptionPane.showMessageDialog(null, 
				mensagem);
		
	}
}
