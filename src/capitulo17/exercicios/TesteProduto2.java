package capitulo17.exercicios;

import javax.swing.JOptionPane;

public class TesteProduto2 {

	public static void main(String[] args) {
		
		Produto prod = new Produto();
		prod.setDescricao(JOptionPane.showInputDialog("Digite o nome do produto:"));
		
		char resposta = JOptionPane.showInputDialog("Digite o caracter da sua Região: (I)nterior, (M)etropolitana ou (L)itoral").charAt(0);
		
		prod.calcularFrete(resposta);
		
		System.out.println(prod.getDescricao() + " serão entregues a um custo de R$"+
				prod.getFrete());
	}
}