package capitulo27;

import java.util.stream.Stream;

public class Exemplo5 {
    public static void main(String[] args) {
         Stream<String> listaS= Stream.of("abc","def","ghi");
         listaS
                 .filter(n -> n.startsWith("a"))
                 .forEach(n -> System.out.println(n));
    }
}
