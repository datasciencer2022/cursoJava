package capitulo18.exercicios;

import javax.swing.JOptionPane;

public class Exerc01 {

	public static void main(String[] args) {
		IndoorBiker cicl = new IndoorBiker();
		
		cicl.inserirDados();
		double taxa = Double.parseDouble(JOptionPane.showInputDialog("Qual a taxa de aumento:"));
		cicl.atualizarValor(taxa);
		cicl.mostrar();
	}
}