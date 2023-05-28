package capitulo06.exercicios;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static boolean paridade(int num) {
			boolean resposta = true;
			if(num==0) {
				JOptionPane.showMessageDialog(null, "Encerrando...");
				System.exit(0);
			}
			else if (num%2==0) {
				resposta = true;
			}
			else {
				 resposta = false;
			}
			return resposta;
	}
		

	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"***Exercício 06***");
		int num=1;
		while (num!=0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
			
			if (paridade(num)) {
				JOptionPane.showMessageDialog(null, "O número " + num + " é Par.");
			}
			else {
				JOptionPane.showMessageDialog(null, "O número " + num + " é Ímpar.");
			}
		}
	}
}