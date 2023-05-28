package capitulo06.exercicios;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static String paridade(int num) {
			String resposta = null;
			if(num==0) {
				JOptionPane.showMessageDialog(null, "Encerrando...");
				System.exit(0);
			}
			else if (num%2==0) {
				resposta = "O número " + num + " é Par.";
			}
			else {
				 resposta = "O número " + num + " é Ímpar.";
			}
			return resposta;
	}
		

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"*** Exercício 9 ***");
		int num=1;
		while (num!=0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
			JOptionPane.showMessageDialog(null,paridade(num));
		}
	}
}