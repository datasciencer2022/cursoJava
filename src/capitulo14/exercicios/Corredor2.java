package capitulo14.exercicios;

public class Corredor2 extends Atleta{
	public double atualizarValor(double taxa) {
			return super.atualizarValor(2*taxa);
	}
	
	private double velocidadeMedia;
	
	public double getVelocidadeMedia() {
			return this.velocidadeMedia;
	}
	
	public void setVelocidadeMedia(double velocidadeMedia) {
			 this.velocidadeMedia = velocidadeMedia;
	}
}