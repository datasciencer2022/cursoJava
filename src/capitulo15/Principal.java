/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo15;

/**
 *
 * @author camila.ceccatto
 */
public class Principal {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta();
        atleta1.inserirDados();

        Time time = new Time();
        time.setCodigoTime(55);
        time.setNomeTime("Time X");
        time.setAtleta(atleta1);

        System.out.println("O time é " + time.getNomeTime());
        System.out.println("O nome do atleta é: "+ time.getAtleta().getNome());
        System.out.println("Repito, o nome do atleta é: " + atleta1.getNome());
	}
}
