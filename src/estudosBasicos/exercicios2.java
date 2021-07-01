package estudosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class exercicios2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double R, A;
		
		
		R = sc.nextDouble();
		A = pi * Math.pow(R, 2);
		System.out.printf("A= %.4f",A);
		
		System.out.println("");
		R = sc.nextDouble();
		A = pi * Math.pow(R, 2);
		System.out.printf("A= %.4f",A);
		
		System.out.println("");
		R = sc.nextDouble();
		A = pi * Math.pow(R, 2);
		System.out.printf("A= %.4f",A);
		
		sc.close();
	}

}
