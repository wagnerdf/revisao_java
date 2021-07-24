package estudosBasicos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava6 {

	public static void main(String[] args) {
		
		/*Nova API de data a partir do JAVA 8*/
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual: "+dataAtual);
		System.out.println("Data atual: "+dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora atual: "+horaAtual);
		System.out.println("Hora atual: "+horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual: "+dataAtualHoraAtual);

		System.out.println("Data e hora atual formata��o padr�o: "+ dataAtualHoraAtual.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println("Data e hora atual formata��o hora: "+ dataAtualHoraAtual.format(DateTimeFormatter.ISO_TIME));
		System.out.println("Data e hora atual formata��o data: "+ dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Data e hora atual formata��o data e hora: "+ dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		
	}

}
