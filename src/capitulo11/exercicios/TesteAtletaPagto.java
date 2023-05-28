package capitulo11.exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class TesteAtletaPagto {
	
	public static void main (String[] args) {

		Atleta atleta= new Atleta();
		atleta.nome = "João";
		atleta.esporte = "Atletismo";
		atleta.valorPatrocinio = 1500.00;

		double taxa = Double.parseDouble(JOptionPane.showInputDialog("Qual a taxa de aumento?"));
		double salario = atleta.atualizarValor(taxa);
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		
		String mensagem = "O atleta "+ atleta.nome;
		mensagem += " teve um aumento de " + taxa + "%.";
		mensagem += "\nNovo Salario: " + formatar.format(salario);
		
		JOptionPane.showMessageDialog(null, mensagem, "Administração - RH", JOptionPane.INFORMATION_MESSAGE);
	}
}