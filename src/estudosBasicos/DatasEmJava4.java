package estudosBasicos;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException {
		
	long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-04-01"), LocalDate.now()); /*total de dias de um até hoje*/
		
	System.out.println("Possui "+ dias +" dias entre a faixa de data");	
		
	dias = ChronoUnit.MONTHS.between(LocalDate.parse("2020-04-01"), LocalDate.now()); /*total de meses de um até hoje*/
	
	System.out.println("Possui "+ dias +" meses entre a data de 2020-04-01");	
	
	dias = ChronoUnit.WEEKS.between(LocalDate.parse("2020-04-01"), LocalDate.now()); /*total de semanas de um até hoje*/
	
	System.out.println("Possui "+ dias +" semanas entre a data de 2020-04-01");
	
	dias = ChronoUnit.YEARS.between(LocalDate.parse("2014-04-01"), LocalDate.now()); /*total de anos de um até hoje*/
	
	System.out.println("Possui "+ dias +" anos entre a data de 2014-04-01");	
	

	}

}
