package capitulo06.exercicios;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void paridade(int num) {
			if(num==0) {
				JOptionPane.showMessageDialog(null, "Encerrando...");
				System.exit(0);
			}
			else if (num%2==0) {
				JOptionPane.showMessageDialog(null, "O número " + num + " é Par.");
			}
			else {
				JOptionPane.showMessageDialog(null, "O número " + num + " é Ímpar.");
			}
	}
		
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"*** Exercício 8 ***");
		int num=1;
		while (num!=0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
			paridade(num);
		}
	}
}