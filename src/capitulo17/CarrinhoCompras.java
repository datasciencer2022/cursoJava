/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo17;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camila.ceccatto
 */
public class CarrinhoCompras {
    List<Produto> listaProd = new ArrayList<Produto>();
	
	public void adicionar(Produto prod) {
		listaProd.add(prod);
	}
}
