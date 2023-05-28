/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo23;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Contato {
    private String nome;
	private String email;
	
	private static List<Contato> minhaLista = new ArrayList<Contato>();
	
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
	
	
	
	
	public static List<Contato> getMinhaLista() { 
		return Contato.minhaLista;
	}
	public static void setMinhaLista(List<Contato> minhaLista) {
		Contato.minhaLista = minhaLista;
	}

	public static void adiciona(Contato c) {
		minhaLista.add(c);
	}

	public static void limpar() {
		minhaLista.removeAll(getMinhaLista());
	}

	@Override
	public String toString() {
		return "\nNome: " + this.nome + " e email: " + this.email;
	}
}
