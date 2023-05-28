package capitulo06.exercicios;

import javax.swing.JOptionPane;

public class Exercicio5{

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"*** Exercício 5 ***");
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		
		if (num%2==0) {
			JOptionPane.showMessageDialog(null, "O número " + num + " é Par.");
		}
		else {
			JOptionPane.showMessageDialog(null, "O número " + num + " é Ímpar.");
		}
	}
}