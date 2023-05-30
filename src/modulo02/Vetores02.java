package modulo02;

import javax.swing.JOptionPane;

public class Vetores02 {

	public static void main(String[] args) {
		
		char gabarito[] = {'b','a','e','c','d'};
		char respostas[] = new char[5];
		
		String mensagem = "Entre com a resposta (a|b|c|d|e)";
		
		
		for (int i = 0; i<5; i++) {
			String resp =
				JOptionPane.showInputDialog(mensagem);

			respostas[i] = resp.charAt(0);
		}
		
		int qtdCertas = 0;
		for (int i = 0; i<5; i++) {
			if (respostas[i] == gabarito[i]) {
				qtdCertas++;
			}
		}
		
		JOptionPane.showMessageDialog(null, 
				qtdCertas + " respostas certas");
	}

}
