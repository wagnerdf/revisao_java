package estudosBasicos;

public class EstruturaWhile {

	public static void main(String[] args) {
		
		/*Estrutura de repeti��o while*/
		
		int numero = 0;
		
		while (numero <= 5) {/*verifica e depois executa*/
			
			System.out.println("O n�mero atual � : "+numero);
			numero++;
			
		}
		
		/*--------------------------------------------------------------------*/
		System.out.println("--------------------------------------------------");
		
		int numero2 = 0;
		do {/* primeiro executa e depois verifica*/
			
			System.out.println("O numero atual �: "+numero2);
			numero2++;
			
		}while (numero2 <=10);
		

	}

}
