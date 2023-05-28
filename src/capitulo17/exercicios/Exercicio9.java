package capitulo17.exercicios;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {
		String meses[] = new String[3];
		for (int i=0; i < meses.length; i++) {
			meses[i] = JOptionPane.showInputDialog("Digite o nome de um mês:");
		}
		
		List<String> listaTri = new ArrayList<String>();
		
		int i = 0;
		while (i < meses.length) {
			listaTri.add(meses[i]);
			i++;
		}
		
		System.out.println(listaTri);
	}

}
