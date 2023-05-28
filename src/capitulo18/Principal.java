/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo18;

/**
 *
 * @author camila.ceccatto
 */
public class Principal {
    public static void main(String[] args) {
		
		Atleta objCiclistaMontanha = new MountainBiker();
		objCiclistaMontanha.inserirDados();
		objCiclistaMontanha.atualizarValor(10);
		
		
		Atleta objCorredor = new Corredor();
		objCorredor.inserirDados();
		objCorredor.atualizarValor(10);
		
		objCiclistaMontanha.mostrar();
		objCorredor.mostrar();
	}
}
