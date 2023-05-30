/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Conjunto01 {
    public static void main(String[] args) {
		Set conjunto = new HashSet();
		
		conjunto.add(76);
		conjunto.add("Fulano Ciclano");
		conjunto.add(3.56);
		conjunto.add(true);
		
		System.out.println("Conteúdo do conjunto: " + conjunto);
		
		if (conjunto.contains(76)) {
			System.out.println("O conjunto contém o inteiro 76");
		}
	

		System.out.println("Removendo o inteiro 76");
		conjunto.remove(76);
		
		if (conjunto.contains(76)) {
			System.out.println("O conjunto ainda contém o inteiro 76");
		}
		else {
			System.out.println("Não contém mais o inteiro 76");
		}
		
		//Percorrendo o conjunto (apenas com iterator)
		Iterator interagir = conjunto.iterator();
		
		while (interagir.hasNext()) {
			System.out.println(interagir.next());
		}
		//Nota: não aparecem na ordem em que foram inseridos!
	}
}
