package modulo04;

import java.time.LocalDateTime;

public class Principal03 {

	public static void main(String[] args) {
		LocalDateTime hoje = LocalDateTime.now();
		
		ContaPoupanca cc = 
		  new ContaPoupanca(45, 2378, 5000.00, hoje, 7.5);
		
		Cliente cli = 
		  new Cliente("Pedro", 52, 1.76, cc);
		
		System.out.println(cli);

	}

}
