/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo19;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author camila.ceccatto
 */
public class CarrinhoCompras {
    private List<Produto> listaProd = new ArrayList<Produto>();
	public void adicionar(Produto prod) {
		this.listaProd.add(prod);
	}
	public List<Produto> gerarLista() {
		return this.listaProd;
	}
}
