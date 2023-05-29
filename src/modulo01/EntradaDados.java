package modulo01;

import java.util.Scanner;

/**
 *
 * @author Geraldo C Cantelli
 */

public class EntradaDados {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scan.next();
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		
		/*
		 * String nomeCompleto = scan.nextLine();
		 * ler linha completa, com espaços
		 * bug conhecido
		 */
		
		String mensagem = "Nome: " + nome +
				" Idade: " + idade +
				" Altura: " + altura;
		
		System.out.println(mensagem);
		//colocar \t e \n
		

	}

}
