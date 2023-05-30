package modulo04;

import java.time.LocalDateTime;

public class Principal02 {

	public static void main(String[] args) {
		LocalDateTime hoje = LocalDateTime.now();
		
		ContaCorrente cc = 
		  new ContaCorrente(45, 2378, 5000.00, hoje, 1000);
		
		Cliente cli = 
		  new Cliente("Pedro", 52, 1.76, cc);
		
		System.out.println(cli);

	}

}
