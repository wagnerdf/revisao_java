package estudosBasicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: "+date.getTime());
		System.out.println("Calendar em milisegundos: "+ calendar.getTimeInMillis());
		
		System.out.println("Dia do mês:  "+date.getDate());
		
		System.out.println("Calendar do mês: "+calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana: "+date.getDay());
		System.out.println("Calendar da semana: "+(calendar.get(Calendar.DAY_OF_WEEK) -1));
		
		System.out.println("Hora do dia: "+date.getHours());
		System.out.println("Calendar hora do dia: "+ calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minutos da hora: "+date.getMinutes());
		System.out.println("Calendar Minutos da hora: "+calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundos: "+date.getSeconds());
		System.out.println("Calendar segundos: "+calendar.get(Calendar.SECOND));
		
		System.out.println("Ano: "+(date.getYear()+1900));
		System.out.println("Calendar ano: "+calendar.get(Calendar.YEAR));
		
		/*---------------------------Simple Date Format------------------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		
		System.out.println("Data atual em formato padrão e String: " + simpleDateFormat.format(date));
		System.out.println("Calendar data atual em formato padrão e String: " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Date em formato para banco de dados: "+simpleDateFormat.format(date));
		System.out.println("Calendar date em formato para banco de dados: "+simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Objeto Date: "+ simpleDateFormat.parse("1987-10-18"));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date: "+simpleDateFormat.parse("18/10/1987"));
		
		
	}
}










