/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo06;

import java.util.Scanner;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Leitura2 {
    public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = ler.next();
		
		System.out.println("Digite um número real (tipo float)");
		float num1 = ler.nextFloat();
		
		System.out.println("Digite outro número real (tipo double)");
		double num2 = ler.nextDouble();
		
		System.out.println(nome + "\n" + num1 + "\n" + num2);
	}
}
