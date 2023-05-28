/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo24;

/**
 *
 * @author Geraldo C Cantelli
 */
public class MinhaExcecao extends Exception {
        @Override
    public String getMessage() {
        String mensagem = "Esse é o erro da exceção customizada do "
                + "Capítulo V! \nOcorreu porque foi clicado o botão"
                + "Salvar mas o campo Nome estava em branco";
        return mensagem;
        
    }

}
