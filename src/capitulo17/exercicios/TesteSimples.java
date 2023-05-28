package capitulo17.exercicios;

import javax.swing.JOptionPane;

public class TesteSimples {

	public static void main(String[] args) {
		Atleta ciclista = new Ciclista();

		ciclista.inserirDados();

		ciclista.atualizarValor(10);

		ciclista.mostrar();
	}
}