package modulo01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDados2 {

	public static void main(String[] args) {
		
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
		//colocar \t e \n
		

	}

}
