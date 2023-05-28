/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo04;

/**
 *
 * @author camila.ceccatto
 */
public class ExercicioResolvido3 {
	public static void main(String[] args) {

		int soma=0;
		int contador=0; 
		int media=0;
		
		for (int i=1; i<11; i++) {
			contador = contador + 1;
			soma = soma + contador;
			
			System.out.println("Laço: " + contador + "   Soma = "+soma);
		}
		media = soma / contador;
		System.out.println("A soma dos 10 primeiros números: "+soma);
		System.out.println("A média dos 10 primeiros números: "+media);
	}    
}
