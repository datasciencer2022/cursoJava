/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo22;

/**
 *
 * @author camila.ceccatto
 */
public class Contato {
    private String nome;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + this.nome + " e email: " + this.email;
	}

}
