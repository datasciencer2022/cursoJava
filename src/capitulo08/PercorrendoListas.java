/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo08;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author camila.ceccatto
 */
public class PercorrendoListas {
    	public static void main(String[] args) {
		List listaMeses = new ArrayList();
		
		for (int i=0; i<12 ; i++) {
			listaMeses.add(JOptionPane.showInputDialog("Digite o " + (i+1) + "º mês:"));
		}

		//Percorrendo a lista com get(contador)
		for (int i=0 ; i<listaMeses.size() ; i++) {
			System.out.println("Mês: " + listaMeses.get(i));
		}
	}

}
