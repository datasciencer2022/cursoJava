package capitulo27;

import java.util.Arrays;
import java.util.List;

import capitulo09.Fatorial;

public class Exemplo2UsandoStreamsELambda {
    public static void main(String[] args) {
         List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7);
         lista.forEach(n -> System.out.println(n+"\t"+Fatorial.fatorial(n)));
    }
}
