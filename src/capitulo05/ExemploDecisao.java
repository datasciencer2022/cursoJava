/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo05;

import javax.swing.JOptionPane;

/**
 *
 * @author Geraldo C Cantelli
 */
public class ExemploDecisao {
  public static void main(String[] args) {
		int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Digite sua idade:"));

		if (idade < 18) {
			System.out.println("menor de idade");
		}
		else {
			System.out.println("maior");
		}	
	}
}
