/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo18;

/**
 *
 * @author camila.ceccatto
 */
public class MountainBiker extends Ciclista {
    @Override
	public void atualizarValor(double taxa) {
		this.setValorPatrocinio((this.getValorPatrocinio() * taxa /100) + this.getValorPatrocinio());
	}

}
