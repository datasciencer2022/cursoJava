package capitulo15.exercicios;

import javax.swing.JOptionPane;

public abstract class TesteProduto {

	public static void main(String[] args) {
		
		DataFabricacao dtFabr = new DataFabricacao();
		dtFabr.setDia(28);
		dtFabr.setMes(3);
		dtFabr.setAno(1977);
		
		Produto prod = new Produto();
		prod.setDescricao(JOptionPane.showInputDialog("Descrição do Produto:"));
		prod.setDtFabr(dtFabr);
		
		JOptionPane.showMessageDialog(null, "O produto: " + prod.getDescricao() + 
				" foi fabricado em " + prod.getDtFabr().dataCompleta());
	}
}