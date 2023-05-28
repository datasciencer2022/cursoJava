package capitulo06.exercicios;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"*** Exercício 7 ***");
		int num=1;

		while(num!= 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
			if(num==0) {
				break;
			}
			else if (num%2==0) {
				JOptionPane.showMessageDialog(null, "O número " + num + " é Par.");
			}
			else {
				JOptionPane.showMessageDialog(null, "O número " + num + " é Ímpar.");
			}
		}
	}
}