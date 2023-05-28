package capitulo26;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class ExibirDataHoraFormatada {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
        LocalDateTime datahora = LocalDateTime.now();
	
        JOptionPane.showMessageDialog(null, datahora.format(formato));
    }
}
