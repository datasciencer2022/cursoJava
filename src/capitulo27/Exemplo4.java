package capitulo27;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import capitulo09.Fatorial;
/**
*
* @author Geraldo C Cantelli
*/
public class Exemplo4 {
    public static void main(String[] args) {
         List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7);
         Stream<Integer> listaS= lista.stream();
         listaS
                 .filter(n -> n > 3)
                 .forEach(n -> System.out.println(n+"\t"+Fatorial.fatorial(n)));
    }
}
