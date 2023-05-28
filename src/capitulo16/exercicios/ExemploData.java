package capitulo16.exercicios;

public class ExemploData {

	private int dia;
	private int mes;
	private int ano;
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public ExemploData() {

	}

	public ExemploData(int mes, int ano) {
		this.mes = mes;
		this.ano = ano;
	}
}
