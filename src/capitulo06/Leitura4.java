/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo06;

import javax.swing.JOptionPane;

/**
 *
 * @author camila.ceccatto
 */
public class Leitura4 {
    public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "A seguir, digite seus dados");

		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		
		JOptionPane.showMessageDialog(null, "Bom dia " + nome);
	}
}
