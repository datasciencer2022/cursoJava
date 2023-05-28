/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo25;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geraldo C Cantelli
 */
public class Contato {
    private int id;
	private String nome;
	private String email;
	
	private static List<Contato> minhaLista = new ArrayList<Contato>();
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
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
		return "\nCódigo: " + this.id + " Nome: " + this.nome + " e email: " + this.email;	}

}
