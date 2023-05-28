package capitulo26;

import java.time.LocalTime;
import javax.swing.JOptionPane;
/**
*
* @author Geraldo C Cantelli
*/
public class ExibirHora {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.now();
	JOptionPane.showMessageDialog(null, hora);        
    }
}
