/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo07;

import javax.swing.JOptionPane;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Vetores2 {
    public static void main(String[] args) {
		int[] idades = new int[6];
		String[] respostas = {"SIM","sim"};
		for(int i = 0; i<6; i++) {
			idades[i]= Integer.parseInt((JOptionPane.showInputDialog("Digite as idades")));
			if (i!=5) {
				String pergunta = JOptionPane.showInputDialog("Deseja Continuar?");
				if (!(pergunta.equals(respostas[0])|| pergunta.equals(respostas[1]))) {
					break;
				}	
			}
		}
		System.out.println("Exibindo os resultados:");
		for (int i=0; i< idades.length; i++) {
			int posicao = i+1;
			System.out.println(posicao + "º idade --> "+ idades[i]);
		}
	}
}
