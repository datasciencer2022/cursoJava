/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo09;

import javax.swing.JOptionPane;

/**
 *
 * @author camila.ceccatto
 */
public class FatorialComWhile {
    public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para cálculo do Fatorial"));
		
		long resposta=1;
		
		while (num>1) {
			resposta = resposta * num;
			num--;
		}
		System.out.println("O Fatorial é: "+ resposta);
	}
}
