package modulo02;

import java.util.Scanner;

/**
 *
 * @author Geraldo C Cantelli
 */

public class MaiorMenor {
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int x=0, menor=0, maior=0, qtd = 0;
		System.out.println("Digite um número (zero para sair): ");
		x = scan.nextInt();
		boolean primeiro = true;
		while (x != 0) {
			qtd++;
			if (primeiro) {
				menor = x;
				maior = x;
				primeiro = false;
			}
			else {
				if (x < menor) {
					menor = x;
				}
				if (x > maior) {
					maior = x;
				}
			}
			x = scan.nextInt();
		}
		
		System.out.println("Menor número: "+ menor);
		
		System.out.println("Menor número: "+ maior);
		
		System.out.println("Total de números: "+ qtd);

	}

}