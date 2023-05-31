package modulo05a;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaPoupanca extends Conta {

	public double taxaJuros;
	
	public ContaPoupanca(int agencia, int numConta, double saldo, LocalDateTime dtCadastro, double taxaJuros) {
		super(agencia, numConta, saldo, dtCadastro);
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	// sobrescrita do método herdado de Conta
	@Override
	public String toString() {
		NumberFormat formato = NumberFormat.getCurrencyInstance();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		
		return "\nAgência: "+super.agencia+"\n"+
				"Conta nº: "+super.numConta+"\n"+
				"Saldo: "+
				formato.format(super.saldo)+"\n"+
				"Data Registro: "+
				  super.dtCadastro.format(formatoData)+"\n"+
				"Taxa juros: "+ this.taxaJuros + "%.";
	}

	@Override
	public boolean sacar(double valor) {
		// em conta poupança não existe valor de limite
		
		if(valor > this.saldo) {
			return false;	
		}
		else {
			this.saldo -= valor;
			return true;
					
		}
	}
}
