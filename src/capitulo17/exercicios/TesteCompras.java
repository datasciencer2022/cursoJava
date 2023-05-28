package capitulo17.exercicios;

public class TesteCompras {

	public static void main(String[] args) {
		Produto caneta1 = new Caneta();
		Caneta caneta2 = new Caneta();

		caneta1.setCodigo(1);
		caneta1.setDescricao("Esferográfica");
		caneta1.setPreco(3);
		
		caneta2.setCodigo(2);
		caneta2.setDescricao("Hidrográfica");
		caneta2.setPreco(4);
		
		CarrinhoCompras meuCarrinho = new CarrinhoCompras();
		meuCarrinho.adicionar(caneta1);
		meuCarrinho.adicionar(caneta2);
	}
}