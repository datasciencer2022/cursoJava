/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo14;

/**
 *
 * @author Geraldo C Cantelli
 */
public class TesteSobrescrita {
    public static void main(String[] args) {
		Atleta atleta = new Atleta();
		Corredor corredor = new Corredor();
		
		atleta.setValorPatrocinio(1000);
		corredor.setValorPatrocinio(1000);
		
		int percentAumento = 15;
		// O mesmo percentual de aumento na chamada dos dois objetos
		atleta.atualizarValor(percentAumento);
		corredor.atualizarValor(percentAumento);
		
		//Porém com resultados diferentes:
		System.out.println("Novo salário de atleta: "+ 
				atleta.getValorPatrocinio());
		
		System.out.println("Novo salário de corredor: "+ 
				corredor.getValorPatrocinio());
	}

}
