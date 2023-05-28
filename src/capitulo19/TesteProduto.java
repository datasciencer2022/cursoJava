/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo19;

/**
 *
 * @author camila.ceccatto
 */
public class TesteProduto {
    	public static void vender(Comercializavel c) {
		c.receber();
		c.entregar();
	}

	public static void main(String[] args) {
		Livro livro = new Livro();
		vender(livro);
	}

}
