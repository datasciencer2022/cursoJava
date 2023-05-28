
package capitulo26;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class ExibirDataFormatada {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
        LocalDate data = LocalDate.now();
	
        JOptionPane.showMessageDialog(null, data.format(formato));
    }
}
