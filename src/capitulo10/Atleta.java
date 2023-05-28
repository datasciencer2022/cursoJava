/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo10;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author camila.ceccatto
 */
public class Atleta {
    public int codigo;
	public String nome;
	public String esporte;
	public double valorPatrocinio;
	
	public void atualizarValor (double taxa) {
		this.valorPatrocinio = this.valorPatrocinio + (this.valorPatrocinio * taxa /100);
	}
        public void mostrar() {
		String mensagem = "Objeto atleta criado a partir da classe Atleta";
		mensagem += "\nCódigo: "+ this.codigo;
		mensagem += "\nNome: "+ this.nome;
		mensagem += "\nEsporte: "+ this.esporte;
		mensagem += "\nValor de Patrocínio: R$"+ this.valorPatrocinio;
	NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		mensagem += "\nValor de Patrocínio: " + formatar.format(this.valorPatrocinio);
		
		JOptionPane.showMessageDialog(null, mensagem);

        }

}
