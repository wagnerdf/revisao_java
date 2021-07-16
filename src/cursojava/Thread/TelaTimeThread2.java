package cursojava.Thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread2 extends JDialog {
	
	private JPanel jpanel = new JPanel(new GridBagLayout()); /*Painel de componentes*/
	
	
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton1 = new JButton("Gerar Lote"); 
	private JButton jButton2 = new JButton("Stop"); 
	

	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	
	
	public TelaTimeThread2() {/*Executa o que tiver dentro no momento da abertura ou execução*/
		// TODO Auto-generated constructor stub
		setTitle("Minha tela de time com THREAD");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				int x = JOptionPane.showConfirmDialog(null, "Deseja sair do programa?", "Close",
						JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (x == JOptionPane.YES_NO_OPTION) {
					//e.getWindow().dispose();/*Finaliza somente à classe que esta aberta no programa*/
					System.exit(0); /*Comando força a saida do sistema por completo, matando a classe de inicialização principal também*/
				}
			}
	});
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();/*Controlador de posicionamento de componentes*/
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
		jpanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jpanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jpanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jpanel.add(mostraTempo2, gridBagConstraints);
		
		//*********************************************************
		
		gridBagConstraints.gridwidth = 1;
		
		jButton1.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jpanel.add(jButton1, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jpanel.add(jButton2, gridBagConstraints);
		
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { /*Executa o click do botão*/
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				for(int qnt =0;qnt < 100;qnt++) {/*Simulando 100 envios em massa*/ 
					
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText()+" - "+qnt);
				jButton2.setEnabled(true);
				fila.add(filaThread);
			 }
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				fila.stop();
				fila = null;
			}
		});
		jButton2.setEnabled(false);
		fila.start();
		add(jpanel, BorderLayout.WEST); 
			
		/*Sempre será o último comando*/
		setVisible(true);/*Torna a tela visivel para o usuário*/
		
		
		
	}

}









