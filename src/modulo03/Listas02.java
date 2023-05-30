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
public class Listas02 {
    	public static void main(String[] args) {
		
    	// Lista sem um tipo definido
    	List<Cliente> minhaLista = 
    			new ArrayList<Cliente>();
    	
    	Cliente cli1 = new Cliente();
    	cli1.entrarDados();
    	minhaLista.add(cli1);
    
    	Cliente cli2 = new Cliente();
    	cli2.entrarDados();
    	minhaLista.add(cli2);
    	
    	Cliente cli3 = new Cliente();
    	cli3.entrarDados();
    	minhaLista.add(cli3);
    	
    	
    	
    	for(int i = 0; i < minhaLista.size(); i++) {
    		minhaLista.get(i).mostrar();
    	}
    	
    	for (Cliente cli: minhaLista) {
    		cli.mostrar();
    	}
    	
    }
}