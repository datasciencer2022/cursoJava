/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo17;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Corredor extends Atleta{
    @Override
	public double atualizarValor(double taxa) {
		return super.atualizarValor(2 * taxa);
	}
	private double velocidadeMedia;

	public double getVelocidadeMedia() {
		return this.velocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
}
