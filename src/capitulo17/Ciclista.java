/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo17;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Ciclista extends Atleta{
    @Override
	public double atualizarValor(double taxa) {
		double valor = super.atualizarValor(taxa);
		valor = valor + 37;
		return valor;
	}

}
