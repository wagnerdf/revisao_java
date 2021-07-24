package estudosBasicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("01/04/2021");
		
		Date dataAtualHoje = simpleDateFormat.parse("11/04/2021");
		
		//After : se data 1 é maior que data 2
		//Before : se data 1 é menor que data 2
		if (dataVencimentoBoleto.before(dataAtualHoje)) { /*Se a data 1 é menor que a data 2*/
			
			System.out.println("Boleto vencido - URGENTE");
		}else {
			System.out.println("Boleto não vencido");
		}
		
		
	}

}
