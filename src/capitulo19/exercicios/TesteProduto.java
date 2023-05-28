package capitulo19.exercicios;

public class TesteProduto {
	public static void vender(Comercializavel c) {
			c.receber();
			c.entregar();
	}
	public static void main(String[] args) {
			 Livro livro = new Livro();
			 vender(livro);
	}
}