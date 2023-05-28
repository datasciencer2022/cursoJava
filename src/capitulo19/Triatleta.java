/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo19;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Triatleta implements Corredor, Nadador, Ciclista{
    @Override
	public void correr() {
		System.out.println("Triatleta correndo o percurso.");

	}

	@Override
	public void nadar() {
		System.out.println("Triatleta nadando durante o percurso.");

	}

	@Override
	public void pedalar() {
		System.out.println("Triatleta pedalando pelo percurso.");

	}

}
