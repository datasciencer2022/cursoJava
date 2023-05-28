package capitulo17.exercicios;

import javax.swing.JOptionPane;

public class TesteProduto1 {

	public static void main(String[] args) {
		
		Produto prod = new Produto();
		prod.setDescricao(JOptionPane.showInputDialog("Digite o nome do produto:"));
		int km = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos quilômetros de distância:"));
		prod.calcularFrete(km);
		System.out.println(prod.getDescricao() + " serão entregues a um custo de R$"+
				prod.getFrete());
	}
}