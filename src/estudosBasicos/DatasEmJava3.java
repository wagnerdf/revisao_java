package estudosBasicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();/*Pega a data atual*/
		
		/*Simular que  data vem do banco de dados*/
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));/*Definindo uma data qualquer*/
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.DAY_OF_MONTH, 40);/*Data especificada mais 40 dias*/
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println("Somando 1 mês: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1);
		
		System.out.println("Somando 1 ano: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
	}

}
