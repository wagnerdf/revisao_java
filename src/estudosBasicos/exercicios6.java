package estudosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class exercicios6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTriangulo = A*C / 2;
		areaCirculo =  3.14159 * C * C;
		areaTrapezio = (A + B) / 2.0 * C;
		areaQuadrado = B * B;	
		areaRetangulo = A * B;
				
		System.out.printf("TRIANGULO: %.3f%n",areaTriangulo);		
		System.out.printf("CIRCULO: %.3f%n",areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n",areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n",areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n",areaRetangulo);
		
		sc.close();
		
	}

}
