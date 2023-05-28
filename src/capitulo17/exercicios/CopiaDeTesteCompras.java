package capitulo17.exercicios;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CopiaDeTesteCompras {

	public static void main(String[] args) {
		Livro livro = new Livro();
		Produto filme = new Filme();
		Produto caderno = new Caderno();
	
		livro.inserirDados();
		filme.inserirDados();
		caderno.inserirDados();
		
		CarrinhoCompras meuCarrinho = new CarrinhoCompras();
		meuCarrinho.adicionar(livro);
		meuCarrinho.adicionar(filme);
		meuCarrinho.adicionar(caderno);
		
		List<Produto> minhaLista = meuCarrinho.gerarLista();

		double totalFrete = 0;
		int km = Integer.parseInt(JOptionPane.showInputDialog("Quantos kilometros para entregar?"));
		
		for(int i=0; i<minhaLista.size(); i++) {
			totalFrete = totalFrete + minhaLista.get(i).calcularFrete(km);
			System.out.println(minhaLista.get(i));
		}
		System.out.println("Total do frete : "+ totalFrete);

	}
}