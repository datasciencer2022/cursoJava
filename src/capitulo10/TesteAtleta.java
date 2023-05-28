/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo10;

/**
 *
 * @author camila.ceccatto
 */
public class TesteAtleta {
    public static void main(String[] args) {		
		
		Atleta atleta= new Atleta();
		atleta.codigo=10;
		atleta.nome = "Joaquim";
		atleta.esporte = "Atletismo";
		atleta.valorPatrocinio = 3980.55;
				
		atleta.mostrar();
	}

}
