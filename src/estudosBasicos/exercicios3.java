package estudosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class exercicios3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D, DIFERENCA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIFERENCA = A*B-C*D;
		
		System.out.println("DIFERENCA = "+DIFERENCA);
		
		sc.close();
	}

}
