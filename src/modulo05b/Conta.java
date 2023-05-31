package modulo05b;

import java.time.LocalDateTime;

public abstract class Conta implements Negociavel{
	protected int agencia;
	protected int numConta;
	protected double saldo;
	protected LocalDateTime dtCadastro;
	
	public Conta() {
		
	}
	//polimorfismo
	public Conta(int agencia, int numConta, double saldo, LocalDateTime dtCadastro) {
		super();
		this.agencia = agencia;
		this.numConta = numConta;
		this.saldo = saldo;
		this.dtCadastro = dtCadastro;
	}
	
	// método herdado pelas filhas e não sobrescrito
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	// método herdado pelas filhas e sobrescrito
		public abstract boolean sacar(double valor);
		
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public LocalDateTime getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(LocalDateTime dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	
	@Override
	public String toString() {
		return "\nAgência: "+this.agencia+"\n"+
				"Conta nº: "+this.numConta+"\n"+
				"Saldo: "+this.saldo+"\n"+
				"Data Registro: "+this.dtCadastro;
	}
	
}
