/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo17;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Geraldo C Cantelli
 */
public class CarrinhoCompras2 {
    private List<Produto3> listaProd = new ArrayList<Produto3>();
	
	public void adicionar(Produto3 prod) {
		int km = Integer.parseInt(JOptionPane.showInputDialog("Quantos kilometros para entregar?"));
		JOptionPane.showMessageDialog(null, "Frete para o produto " + prod.getDescricao() + " é " + prod.calcularFrete(km));
		this.listaProd.add(prod);
	}

	public List<Produto3> gerarLista() {
		return this.listaProd;
	}

}
