/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo02;

import javax.swing.JOptionPane;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Decisao02 {
  public static void main(String[] args) {
		int i = Integer.parseInt(
				JOptionPane.showInputDialog("Digite um número inteiro:"));

		if (i % 2 == 0) {
			System.out.println(i + " é par");
		}
		else {
			System.out.println(i + " é impar");
		}	
	}
}
