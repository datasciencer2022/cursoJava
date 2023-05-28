package capitulo04;

public class ExercicioProposto1 {


	public static void main(String[] args) {
		
		int soma=0;
		int contador=0; 
		int media=0;
		
		for (int i=1; i<=10; i++) {
			contador = contador + 1;
			soma = soma + contador;
			
			System.out.println("Laço: " + contador + "   Soma = "+soma);
		}
		media = soma / contador;
		System.out.println("A soma dos 10 primeiros números: "+soma);
		System.out.println("A média dos 10 primeiros números: "+media);

	}

}