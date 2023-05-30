package modulo04;

import java.time.LocalDateTime;

public class Principal01 {

	public static void main(String[] args) {
		LocalDateTime hoje = LocalDateTime.now();
		
		Conta c = 
		  new Conta(45, 2378, 5000.00, hoje);
		
		Cliente cli = 
		  new Cliente("Pedro", 52, 1.76, c);
		
		System.out.println(cli);

	}

}
