
package capitulo26;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class ExibirData {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
	JOptionPane.showMessageDialog(null, data);
    }
}