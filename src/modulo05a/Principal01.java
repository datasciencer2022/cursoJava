package modulo05a;

import java.time.LocalDateTime;

public class Principal01 {

	public static void main(String[] args) {

		/*
		 *  classe abstrata não pode ser instanciada
		 *  Conta c = new Conta();
		 *  não compila
		 */
			
		LocalDateTime hoje = LocalDateTime.now();
		
		Conta cc = new ContaCorrente(45, 2378, 5000.00, hoje, 1000);
		Conta cp = new ContaPoupanca(45, 2378, 5000.00, hoje, 7.5);
		
		cc.depositar(500);
		cp.depositar(500);
		
		System.out.println("Conta corrente: "+ cc);
		
		System.out.println("\n");
		
		System.out.println("Conta poupança: "+ cp);

	}

}
