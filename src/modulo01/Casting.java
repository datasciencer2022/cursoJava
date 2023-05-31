package modulo01;

import java.util.Scanner;

/**
 *
 * @author Geraldo C Cantelli
 */

public class Casting {
    	public static void main(String[] args) {
    		int i = 9;
    		double d = i;
    		System.out.println("i= "+ i + " d= " + d);
    		//aqui ocorreu promoção de inteiro 
    		//para double
    		
    		//i = d;
    		// não compila sem fazer casting
    		i = (int) d;
    		System.out.println("i= "+ i+ " d= "+ d);
    		
    		
    	}
}
