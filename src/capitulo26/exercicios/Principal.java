package capitulo26.exercicios;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {

		DateTimeFormatter formato = 
				DateTimeFormatter.ofPattern	("dd/MM/yyyy HH:mm:ss");
		
		
		LocalDateTime momentoAtual = LocalDateTime.now();
		
		ZonedDateTime agoraSP = ZonedDateTime.of(momentoAtual, ZoneId.of("America/Sao_Paulo"));
		
		System.out.println(agoraSP);
		
		ZonedDateTime agoraLA = ZonedDateTime.of(momentoAtual, ZoneId.of("America/Los_Angeles"));
		
		System.out.println(agoraLA);	
		
	}

}
