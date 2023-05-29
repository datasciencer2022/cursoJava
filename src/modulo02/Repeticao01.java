package modulo02;

/**
 *
 * @author Geraldo C Cantelli
 */

public class Repeticao01 {

	public static void main(String[] args) {
		
		int i=0;  //declaração e inicialização
		
		while (i <= 50000) {
			System.out.println(i);
			i++;
			// vale só para acréscimo de 1 em 1
			// o mesmo que i += 1;
			// o mesmo que i = i + 1;
			// i--; também funciona
		}
	}

}
