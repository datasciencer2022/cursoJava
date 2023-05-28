/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo15;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Time {
    private int codigoTime;
    private String nomeTime;
	
    private Atleta atleta;
	
	public int getCodigoTime() {
		return codigoTime;
	}
	public void setCodigoTime(int codigoTime) {
		this.codigoTime = codigoTime;
	}
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public Atleta getAtleta() {
		return atleta;
	}
	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}

}
