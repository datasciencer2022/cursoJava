package capitulo17.exercicios;

public class Ciclista extends Atleta{

	@Override
	public double atualizarValor(double taxa) {
		double valor = super.atualizarValor(taxa);
		valor = valor + 37;
		this.setValorPatrocinio(valor);
		return valor;
	}
}