package capitulo26;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;
/**
*
* @author Geraldo C Cantelli
*/
public class ExibirDataHora {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();
	JOptionPane.showMessageDialog(null, dataHora);
    }
}
