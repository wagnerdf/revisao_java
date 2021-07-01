package estudosBasicos;

public class EstruturaFor {

	public static void main(String[] args) {
		
		/*Estrutura de repetição FOR com Break (Parada) e (Continue) */
		
		for(int numero = 0;numero <= 10;numero++) {
			if (numero == 3) {
				System.out.println("Obaaa, encontrei o numero 3");
				System.out.println("Estou parando a execução...");
				break;
			}
			
			
			
			
		}
		
		System.out.println("-------------------------------------------------");
		for (int numero2 = 0; numero2 <= 10;numero2++) {
			if (numero2 == 3 || numero2 == 6 || numero2 == 9) {
				System.out.println("Obaaa, encontrei o numero "+ numero2);
				continue;
			}
			System.out.println("Numero = "+numero2);
			System.out.println("Processando laço de repitição");
			
		}
		
		
		

	}

}
