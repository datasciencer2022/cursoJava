package capitulo09.exercicios;

public class Fibonacci_2 {

	public static void main(String[] args) {
		String sequencia = "0, 1";
		int[] vetor= new int[20];
		
		vetor[0] = 0;
		vetor[1] = 1;
		
		int j = 2;
		while (j<20) {
			vetor[j] = vetor[j-1] + vetor[j-2];
			sequencia = sequencia + ", " + vetor[j]; 
			j++;
		}
		System.out.println("Fibonacci: " + sequencia);		
	}
}