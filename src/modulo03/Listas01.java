/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Listas01 {
public static void main(String[] args) {
		
    	// Lista sem um tipo definido
    	List minhaLista = new ArrayList();
		minhaLista.add("Fulano");  //nome
		minhaLista.add(40);  //idade
		minhaLista.add(1.74);  //altura
		
		System.out.println(minhaLista.get(0)+
				" tem "+minhaLista.get(1)+
				" anos e mede "+ minhaLista.get(2) +
				" metros.");
		}
}
