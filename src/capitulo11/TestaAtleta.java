/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11;

/**
 *
 * @author Geraldo C Cantelli
 */
public class TestaAtleta {
	public static void main(String[] args) {
		
		Atleta atleta= new Atleta();
		
		atleta.inserirDados();
                atleta.atualizarValor(20);
				
		atleta.mostrar();
	}
}
