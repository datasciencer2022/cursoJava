/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo18;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author camila.ceccatto
 */
public abstract class Atleta {
    private int codigo;
	private String nome;
	private String esporte;
	private double valorPatrocinio;
	
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEsporte() {
		return this.esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public double getValorPatrocinio() {
		return this.valorPatrocinio;
	}

	public void setValorPatrocinio(double valorPatrocinio) {
		this.valorPatrocinio = valorPatrocinio;
	}

	public void inserirDados() {
		this.codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o código:"));
		this.nome = JOptionPane.showInputDialog("Digite o nome:");
		this.esporte = JOptionPane.showInputDialog("Digite o esporte praticado:");
		this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Patrocínio:"));
	}
	
	public abstract void atualizarValor (double taxa) ;
	
	public void mostrar() {
		String mensagem = "\nCódigo: "+ this.codigo;
		mensagem += "\nNome: "+ this.nome;
		mensagem += "\nEsporte: "+ this.esporte;
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		mensagem += "\nValor de Patrocínio: " + formatar.format(this.valorPatrocinio);
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
