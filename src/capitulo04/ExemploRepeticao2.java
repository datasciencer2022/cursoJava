/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo04;

/**
 *
 * @author Geraldo C Cantelli
 */
public class ExemploRepeticao2 {
    	public static void main(String[] args) {
		
		int auxiliar=0;  //primeiro declaramos a variável auxiliar
		
		do {
			System.out.println(auxiliar);
			auxiliar=auxiliar+1;
		}
		while (auxiliar<=100000);
	}

}
