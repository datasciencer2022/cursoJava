package modulo04;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;

public class ContaCorrente extends Conta {

	private double limite;
	
	public ContaCorrente() {
		
	}
	//herança
	
	

	
	public ContaCorrente(int agencia, int numConta, double saldo, LocalDateTime dtCadastro,double limite) {
		super(agencia, numConta, saldo, dtCadastro);
		this.limite = limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}

	// sobrescrita do método herdado de Conta
	@Override
	public String toString() {
		NumberFormat formato = NumberFormat.getCurrencyInstance();
		
		return "\nAgência: "+super.agencia+"\n"+
				"Conta nº: "+super.numConta+"\n"+
				"Saldo: "+
				formato.format(super.saldo)+"\n"+
				"Data Registro: "+super.dtCadastro+"\n"+
				"Limite: "+ formato.format(this.limite);
	}
}
