package capitulo27;

import java.util.stream.Stream;

public class Exemplo6 {
    public static void main(String[] args) {
         Stream<String> listaS= Stream.of("abc","def","ghi");
         listaS
                 .forEach(n -> System.out.println(n.toUpperCase()));
    }
}