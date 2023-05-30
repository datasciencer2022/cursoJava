package modulo04;

import javax.swing.JOptionPane;

public class Cliente {
	private String nome;
	private int idade;
	private double altura;
	private Conta conta;
	
	// construtor vazio (automático se não tiver outro)
	public Cliente() {
		
	}
	
	
	// construtor especializado
	public Cliente(String nome, int idade, double altura, Conta conta) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.conta = conta;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public Conta getConta() {
		return conta;
	}



	public void setConta(Conta conta) {
		this.conta = conta;
	}



	public void entrarDados() {
		this.nome = JOptionPane.showInputDialog("Digite seu nome: ");
		this.idade = Integer.parseInt(
				JOptionPane.showInputDialog("Digite sua idade: "));;
	
		this.altura = Double.parseDouble(
					JOptionPane.showInputDialog("Digite sua altura: "));;
	}
	


	@Override
	public String toString() {
		return this.nome +
				" tem "+ this.idade +
				" anos, mede "+ this.altura +
				" metros e tem a conta: "+
				this.conta;
	}
	
	
}
