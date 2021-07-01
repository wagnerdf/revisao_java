package estudosBasicos;

import java.util.Scanner;

public class copiarCaracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite o nome: ");
		nome = sc.nextLine();
		
		System.out.println(nome.charAt(0));
		System.out.println(nome.substring(0,3));
		
		
		sc.close();
	}

}
