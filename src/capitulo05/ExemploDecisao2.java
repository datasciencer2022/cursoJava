/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo05;

/**
 *
 * @author camila.ceccatto
 */
public class ExemploDecisao2 {
    	public static void main(String[] args) {
		String nome = "João";
		int idade = 8; //supondo que o usuário digite 08
		if (idade < 10) {
			System.out.println(nome + " é "+ "menor e criança");
		}
		if (idade < 18) {
			System.out.println(nome + " é "+ "menor e adolescente");
		}	
		if (idade < 21) {
			System.out.println(nome + " é "+ "maior e jovem adulto");
		}
		else {
			System.out.println(nome + " é "+ "maior e adulto");
		}
	}
}
