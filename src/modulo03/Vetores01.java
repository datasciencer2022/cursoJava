package modulo03;

import javax.swing.JOptionPane;

public class Vetores01 {

	public static void main(String[] args) {
		
		double alturas[] = new double[4];
		alturas[0] = 1.81;
		alturas[1] = 1.74;
		alturas[2] = 1.71;
		alturas[3] = 1.69;
		
		
		
		int idades[] = new int[5];
		
		for (int i = 0; i<5; i++) {
			idades[i] = Integer.parseInt(
					JOptionPane.showInputDialog("Digite sua idade ou a de um amigo(a)"));
		}

		for (int i = 0; i<5; i++) {
			JOptionPane.showMessageDialog(null, idades[i]);
		}
		
	}

}
