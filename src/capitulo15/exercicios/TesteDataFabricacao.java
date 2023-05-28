package capitulo15.exercicios;

import javax.swing.JOptionPane;

public class TesteDataFabricacao {

	public static void main(String[] args) {
		
		DataFabricacao minhaData  = new DataFabricacao();
		
		minhaData.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia:")));
		minhaData.setMes(Integer.parseInt(JOptionPane.showInputDialog("Mês:")));
		minhaData.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano:")));

		System.out.println(minhaData.dataCompleta());
	}
}