package capitulo19.exercicios;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
public class Exerc02 {
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.inserirDados();
		Produto produto2 = new Produto();
		produto2.inserirDados();
		Produto produto3 = new Produto();
		produto3.inserirDados();

		CarrinhoCompras minhaCompra = new CarrinhoCompras();
		
		minhaCompra.adicionar(produto1);
		minhaCompra.adicionar(produto2);
		minhaCompra.adicionar(produto3);
		Iterator<Produto> iterar = minhaCompra.gerarLista().iterator();

	    while (iterar.hasNext()){
	      System.out.print(iterar.next().toString());
	      System.out.print(", ");
	    }
	  
	}
}
