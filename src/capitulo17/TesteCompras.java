/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo17;

/**
 *
 * @author camila.ceccatto
 */
public class TesteCompras {
    public static void main(String[] args) {
		Produto filme1 = new Filme();
		Produto livro1 = new Livro();
		
		CarrinhoCompras meuCarrinho = new CarrinhoCompras();
		meuCarrinho.adicionar(filme1);
		meuCarrinho.adicionar(livro1);
	}
}
