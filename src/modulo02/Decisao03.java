/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo02;

import javax.swing.JOptionPane;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Decisao03 {
  public static void main(String[] args) {
		
	  boolean tempoBom = true;
	  boolean cantorFavorito = true;
	  
	  if (tempoBom && cantorFavorito) {
		  System.out.println("Vou ao show!");
	  }
	  else {
		  System.out.println("Não vou!");
	  }
	  
	  
	  boolean estaChovendo = true;
	  boolean poucaGrana = true;
	  
	  if (estaChovendo || poucaGrana) {
		  System.out.println("Não vou!");
	  }
	  else {
		  System.out.println("Vou ao show!");
	  }
	}
}
