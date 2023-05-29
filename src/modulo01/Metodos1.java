package modulo01;

import javax.swing.JOptionPane;

/**
 *
 * @author Geraldo C Cantelli
 */

public class Metodos1 {

	// sem retorno
	public static void receberDados() {
		String nome = JOptionPane.showInputDialog(
				"Digite seu nome: ");
		
		int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Digite sua idade: "));
		
		
		double altura = Double.parseDouble(
				JOptionPane.showInputDialog("Digite sua altura: "));
		
		
		String mensagem = "Nome: " + nome +
				" Idade: " + idade +
				" Altura: " + altura;
		
		JOptionPane.showMessageDialog(null, mensagem);
	
	}

	// com  retorno
	public static String receberDadosComRetorno() {
		String nome = JOptionPane.showInputDialog(
				"Digite seu nome: ");
		
		int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Digite sua idade: "));
		
		
		double altura = Double.parseDouble(
				JOptionPane.showInputDialog("Digite sua altura: "));
		
		
		String mensagem = "Nome: " + nome +
				" Idade: " + idade +
				" Altura: " + altura;
		
		return mensagem;
	
	}
	public static void main(String[] args) {
		
		receberDados();
		
		String mensagem = receberDadosComRetorno();
		
		System.out.println(mensagem);
	}

}
