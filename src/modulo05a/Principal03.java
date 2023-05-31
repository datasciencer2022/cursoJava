package modulo05a;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Principal03 {

	public static void main(String[] args) {
	
		LocalDateTime hoje = LocalDateTime.now();
		
		Conta cc = new ContaCorrente(45, 2378, 5000.00, hoje, 1000);
		Conta cp = new ContaPoupanca(45, 2378, 5000.00, hoje, 7.5);
		
		Cliente cli1 = 
				  new Cliente("Pedro", 52, 1.76, cc);
		
		Cliente cli2 = 
				  new Cliente("Maria", 34, 1.69, cp);
		
		List<Cliente> minhaLista = new ArrayList<Cliente>();
		minhaLista.add(cli1);
		minhaLista.add(cli2);
		
		for(Cliente cli: minhaLista) {
			cli.getConta().depositar(500);
			cli.getConta().sacar(6000);
			System.out.println(cli);
		}

	}

}
