/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo19;

import javax.swing.JOptionPane;

import capitulo17.Produto;

/**
 *
 * @author camila.ceccatto
 */
public class Livro extends Produto implements Comercializavel{
    @Override
	public void entregar() {
		String local = JOptionPane.showInputDialog("Qual endereço de entrega?");
		System.out.println("Entregando livro em: " + local);
	}

	@Override
	public void receber() {
		String opcao = JOptionPane.showInputDialog("Qual a forma de pagamento?");
		System.out.println("Recebendo pagamento do livro por: " + opcao);
	}

}
