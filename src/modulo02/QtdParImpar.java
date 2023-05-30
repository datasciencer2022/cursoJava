/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo02;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author Geraldo C Cantelli
 */
public class QtdParImpar {
	static Scanner scan = new Scanner(System.in);
	
	
	public static boolean ehPar(int x) {
		return (x % 2 == 0);
	}
	
	public static boolean ehImpar(int x) {
		return (x % 2 != 0);
	}
	
  public static void main(String[] args) {
	  int x = 0;
	  int qtdPar = 0, qtdImpar = 0;
	  
	  System.out.println("Digite um número (zero para sair): ");
		x = scan.nextInt();
		while (x != 0) {
			if (ehPar(x)) {
				qtdPar++;
			}
			if (ehImpar(x)) {
				qtdImpar++;
			}
			x = scan.nextInt();
		}	
		
		System.out.println("Quantidade de números pares: "+ qtdPar);
	
		System.out.println("Quantidade de números ímpares: "+ qtdImpar);
  }
}
