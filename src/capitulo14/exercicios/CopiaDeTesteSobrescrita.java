package capitulo14.exercicios;

import javax.swing.JOptionPane;

public class CopiaDeTesteSobrescrita {

	public static void main(String[] args) {
		Atleta atleta = new Atleta();
		Corredor2 corredor = new Corredor2();
		
		double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do" +
				" patrocínio para ambos"));
		
		atleta.setValorPatrocinio(sal);
		corredor.setValorPatrocinio(sal);
		
		int percentAumento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da " +
				"percentagem de aumento"));
		
		// O mesmo percentual de aumento na chamada dos dois objetos
		atleta.atualizarValor(percentAumento);
		corredor.atualizarValor(percentAumento);
		
		//Porém com resultados diferentes:
		System.out.println("Novo salário de atleta: "+ 
				atleta.getValorPatrocinio());
		
		System.out.println("Novo salário de corredor: "+ 
				corredor.getValorPatrocinio());
	}
}