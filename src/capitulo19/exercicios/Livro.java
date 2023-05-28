package capitulo19.exercicios;


import javax.swing.JOptionPane;

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