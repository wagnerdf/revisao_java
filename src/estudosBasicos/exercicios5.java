package estudosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class exercicios5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codP1, codP2, numP1, numP2;
		double valorP1, valorP2, valorPagar;
		
		System.out.println("Informe o Codigo da peça 01: ");
		codP1 = sc.nextInt();
		System.out.println("Informe o numero de paças 01: ");
		numP1 = sc.nextInt();
		System.out.println("Informe o valor da paças 01: ");
		valorP1 = sc.nextDouble();
		
		System.out.println("Informe o Codigo da peça 02: ");
		codP2 = sc.nextInt();
		System.out.println("Informe o numero de paças 02: ");
		numP2 = sc.nextInt();
		System.out.println("Informe o valor da paças 02: ");
		valorP2 = sc.nextDouble();
		
		valorPagar = numP1*valorP1 + numP2*valorP2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",valorPagar);
		
		sc.close();
	}

}
