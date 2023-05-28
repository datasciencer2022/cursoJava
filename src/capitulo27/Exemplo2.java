package capitulo27;

import java.util.Arrays;
import java.util.List;

import capitulo09.Fatorial;
/**
*
* @author Geraldo C Cantelli
*/
public class Exemplo2 {
    public static void main(String[] args) {
         List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7);
         for (Integer n : lista){
            System.out.println(n+"\t"+Fatorial.fatorial(n));    
         }
    }
}
