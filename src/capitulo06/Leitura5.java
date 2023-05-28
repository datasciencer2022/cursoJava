/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo06;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Leitura5 {
    	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Calculando parcelas do crediário...");
		double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
		int numParcelas = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas?"));
		
		double valorParcela = valorTotal / numParcelas;
		
		NumberFormat formato = new DecimalFormat("R$ ###,000.00");
		
		JOptionPane.showMessageDialog(null, "O valor de cada parcela é: " + formato.format(valorParcela));
	}

}
