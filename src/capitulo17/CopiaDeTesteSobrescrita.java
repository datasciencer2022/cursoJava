/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo17;

/**
 *
 * @author Geraldo C Cantelli
 */
public class CopiaDeTesteSobrescrita {
    public static void main(String[] args) {

		Atleta corredorAtleta = new Corredor();
		Corredor corredor = new Corredor();

		corredorAtleta.inserirDados();
		corredor.inserirDados();
		//Foi possível chamar o método inserirDados() nos dois casos 
		//pois eles fazem parte da classe mãe
		
		corredorAtleta.mostrar();
		corredor.mostrar();
		
		corredorAtleta.setVelocidadeMedia(80); // Essa linha não compila
		// pois não há método setVelocidadeMedia(..) na classe mãe Atleta
		corredor.setVelocidadeMedia(80);
	}

}
