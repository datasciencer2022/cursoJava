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
public class Leitura {
    	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = ler.next();
		
		System.out.println("Digite um número inteiro (tipo byte)");
		byte num1 = ler.nextByte();
		
		System.out.println("Digite um número inteiro (tipo short)");
		short num2 = ler.nextShort();

		System.out.println("Digite um número inteiro (tipo int)");
		int num3 = ler.nextInt();

		System.out.println("Digite um número inteiro (tipo long)");
		long num4 = ler.nextLong();
		
		System.out.println(nome + "\n" + num1 + "\n" + num2 +"\n" + num3 +
				"\n" + num4);
	}

}
