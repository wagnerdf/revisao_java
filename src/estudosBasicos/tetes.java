package estudosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class tetes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Quantas Horas? ");
		hora = sc.nextInt();
		
		if(hora >= 00 && hora <=12){
			System.out.println("Bom dia");
		}
		else if (hora >12 && hora <18) {
			System.out.println("Boa tarde");
		}
		else if (hora >=18 && hora <=23) {
			System.out.println("Boa noite");
		}else{
			System.out.println("Hora incorreta");
		}
		
		sc.close();

	}

}
