package cursojava.Thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*Thread processando em paralelo do envio do e-mail*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		/*Thread processando em paralelo do envio de nota fiscal*/
		Thread threadNFE = new Thread(thread2); 
		threadNFE.start();
		
		
		/*Codigo do sistema do usuário continua o fluxo de trabalho*/
		System.out.println("As funcionalidade THREAD estão em execução em Background");
		/*Fluxo do sistema, cadastro de venda, um emissão de nota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário e as THREADS ON EM BACKGROUND");
		
		System.out.println("Continuando estudos");
		
	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {/*Executa o que nós queremos*/		
			
				/*codigo da rotina que eu quero executar em paralelo*/ 
				for(int i =0; i < 10;i++) {
					
					
					/*Quero executar esse envio com tempo de parada, ou com tempo determinado*/
					System.out.println("Executando algo rotina, por exemplo envio de nota fiscal");
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}/*Dá um tempo de 1 segundos*/
					
				}
				/*Fim do codigo paralelo*/
			
			
		}
	};
	
	

	private static Runnable	thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			/*Codigo da rotina*/
			
			/*codigo da rotina que eu quero executar em paralelo*/ 
			for(int i =0; i < 10;i++) {
				
				
				/*Quero executar esse envio com tempo de parada, ou com tempo determinado*/
				System.out.println("Executando algo rotina, por exemplo envio de e-mail");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}/*Dá um tempo de 1 segundos*/
				
			}
			/*Fim do codigo paralelo*/
			
		}
	};

}
