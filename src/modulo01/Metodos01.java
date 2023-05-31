package modulo01;

import java.util.Scanner;

/**
 *
 * @author Geraldo C Cantelli
 */

public class Metodos01 {

	public static void cumprimentar() {
		System.out.println("Bom dia/tarde/noite !");
	}
	
	public static double calcularMedia(int a, int b) {
		
		double resposta = (a + b) / 2; 
		
		return resposta;
	
	}
	

	public static void main(String[] args) {
		
		cumprimentar();
		
	}
}
		
		
		
		
		
		
		
		
		/*

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int a = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int b = scan.nextInt();
		
		System.out.println("A média entre " + a + 
			" e " + b + " é: " + calcularMedia(a, b));
		
		
	}
		
}		*/
