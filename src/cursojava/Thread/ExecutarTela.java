package cursojava.Thread;

import javax.swing.JOptionPane;

public class ExecutarTela {
	
	public static void main(String[] args) {
		
		
		int x = JOptionPane.showConfirmDialog(null, "Deseja testar THREAD utilizando PILHA?\n Em caso de NÃO séra mostrada a teste THREAD com tempo.", "Escolha",
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
		if (x == JOptionPane.YES_NO_OPTION) {
			TelaTimeThread2 telaTimeThread = new TelaTimeThread2();
		}else {
			TelaTimeThread telaTimeThread = new TelaTimeThread();
		}
		
		
		
		
	}

}
