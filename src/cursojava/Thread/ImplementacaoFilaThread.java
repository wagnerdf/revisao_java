
package cursojava.Thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		
		
		while(true) {
		
		
		synchronized (pilha_filha) { /*Bloquear o acesso a esta lista por outros processos*/
			
			Iterator iteracao = pilha_filha.iterator();
			while(iteracao.hasNext()) {/*Enquanto conter dados na lista ir� processar*/
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/*Pega objeto atual*/
				
				/*Processar 10 mil notas fiscal*/
				/*Gerar uma lista emorme de PDF*/
				/*Gerar um envio em massa de email*/
				System.out.println("----------------------------------------");
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();
				
				try {
					Thread.sleep(1000);/*Dar um tempo para descarga de memoria*/
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
		try {
			Thread.sleep(1000);/*Processou toda a lista */
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
		

	}
	
	
}
