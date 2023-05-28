/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo05;

/**
 *
 * @author Geraldo C Cantelli
 */
public class ExemploDecisao4 {
    	public static void main(String[] args) {
		
		char letra = 'x';
		
		switch(letra) {
		
		case 'c': System.out.println("letra c");
		break;
		
		case 'p': System.out.println("letra p");
		break;
		
		case 'u': System.out.println("letra u");
		break;
		
		default: System.out.println("Opção não disponível");
		         System.out.println("Não foram escolhidas 'c', 'p' nem 'u'");
		}
	}
}
