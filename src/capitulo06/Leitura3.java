/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo06;

import java.util.Scanner;

/**
 *
 * @author camila.ceccatto
 */
public class Leitura3 {
    public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = ler.next();
		
		System.out.println("Digite seu endereco: ");
		ler.nextLine();
		String endereco = ler.nextLine();
		
		System.out.println("Digite seu recado: ");
		String recado = ler.nextLine();

		System.out.println("Resultado: \n" + nome + "\n" + endereco + 
				"\n" + recado);
	}
}
