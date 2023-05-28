package capitulo26;

import java.time.LocalTime;
import javax.swing.JOptionPane;

public class ExibirHora {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.now();
	JOptionPane.showMessageDialog(null, hora);        
    }
}
