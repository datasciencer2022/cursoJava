package capitulo16.exercicios;

import javax.swing.JOptionPane;

public class TesteExemploData {

	public static void main(String[] args) {
		
	int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês: "));
	int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));

	ExemploData data = new ExemploData(mes, ano);
	
	String mensagem = "Mês e ano: " + data.getMes() + "/" + data.getAno();
	
	JOptionPane.showMessageDialog(null, mensagem);
	
	}
}