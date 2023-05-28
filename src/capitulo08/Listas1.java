/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo08;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Listas1 {
    	public static void main(String[] args) {
		List lista = new ArrayList();
		lista.add(77);
		lista.add("Nome e Sobrenome");
		lista.add(3003.32);
		
		System.out.println("Lista com elementos diferentes: " + lista);
		
		lista.clear();
		
		System.out.println("Lista esvaziada: " + lista);
	}

}
