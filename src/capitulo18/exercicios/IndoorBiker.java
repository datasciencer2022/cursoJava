package capitulo18.exercicios;

public class IndoorBiker extends Ciclista {

	@Override
	public void atualizarValor(double taxa) {
		this.setValorPatrocinio((this.getValorPatrocinio() * taxa /100) + this.getValorPatrocinio());
	}
}
