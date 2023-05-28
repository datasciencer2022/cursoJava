package modulo02;

import java.util.Scanner;

public class Repeticao03 {
	static Scanner scan = new Scanner(System.in);
	
	public static double calcMedia (int qtd) {
		int soma=0;
		int resposta = 0;
		

		
		for (int i=1; i<= qtd; i++) {
			System.out.println("Digite o "+ i + "°: ");
			soma = soma + scan.nextInt();
		}
		return soma /  qtd;
	}
	public static void main(String[] args) {
		
		int qtd = 0;
		System.out.println("Quantos números deseja digitar: ");
		qtd = scan.nextInt();
		
		System.out.println("Total de números: "+ qtd);
		
		System.out.println("Total de números: "+ 
					calcMedia(qtd));

	}

}