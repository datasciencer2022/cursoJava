package capitulo09.exercicios;

import javax.swing.JOptionPane;

public class FatorialComFor {
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para " +
				"cálculo do Fatorial"));
		
		long resposta=1;
		
		for (int i=num; i>1; i--) {
			resposta = resposta * i;
		}
		System.out.println("O Fatorial de " + num + " é: "+ resposta);
	}
}