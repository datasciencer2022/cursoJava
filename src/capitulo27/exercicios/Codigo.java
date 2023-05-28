package capitulo27.exercicios;

import java.util.stream.Stream;

public class Codigo {

	public static void main(String[] args) {
		Stream<String> listaS= Stream.of("abc","def","ghi");
		listaS.forEach(System.out::println);
		
		
		//listaS.forEach(n -> System.out.println(n.toUpperCase()));
		
	}

}
