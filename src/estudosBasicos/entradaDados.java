package estudosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		String x;
		x = sc.next();
		
		System.out.println("Você digitou: "+ x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: "+ y);
		
		double z;
		z = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", z);
		
		char h;
		h = sc.next().charAt(0);
		System.out.printf("Você digitou: "+ h);
		
		String a;
		int b;
		double c;
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();

	}

}
