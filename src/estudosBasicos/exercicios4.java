package estudosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class exercicios4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nf;
		double nht, vh, salario;
		
		nf = sc.nextInt();
		nht = sc.nextDouble();
		vh = sc.nextDouble();
		
		salario = vh*nht;
		
		System.out.println("NUMERO = "+nf);
		System.out.printf("SALARY = %.2f",salario);
		
		sc.close();
	}

}
