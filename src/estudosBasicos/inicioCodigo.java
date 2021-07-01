package estudosBasicos;

import java.util.Scanner;

public class inicioCodigo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro Programa Java");
		
		float media1 = 50; 
		float media2 = 68;
		float media3 = 78;
		float media4 = 04;
		
		float media = (media1 + media2 + media3 + media4) / 4;
		
		
		System.out.println("Nota do aluno: "+media);
		

		String saidaResultado = media >= 70 ? "Aluno aprovado" : (media >=50 && media <=69) ? "Aluno em recuperação" : "Aluno reprovado";
		
		System.out.println(saidaResultado);
		
		/*SWITCH CASE: OPERAÇÕES EXATAS*/
		
		int dia;
		
		System.out.println("Informe o dia: ");
		dia = sc.nextInt();
		
		switch (dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;	
			case 3:
				System.out.println("Terça-feira");
				break;
			default: System.out.println("Outro dia qualquer");
				break;
		}
		
	sc.close();	
		
	}
	
	

}
