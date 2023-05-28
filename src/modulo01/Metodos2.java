package modulo01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Metodos2 {

	
	public static double calcularMedia(int a, int b) {
		
		double resposta = (a + b) / 2; 
		
		return resposta;
	
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int b = scan.nextInt();
		
		System.out.println("A média entre " + a + 
			" e " + b + " é: " + calcularMedia(a, b));
	}

}
