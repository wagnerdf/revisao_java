package cursojava.Thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	private JPanel jpanel = new JPanel(new GridBagLayout()); /*Painel de componentes*/
	
	private JLabel descricaoHora = new JLabel("Time thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton1 = new JButton("Start"); 
	private JButton jButton2 = new JButton("Stop"); 
	
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {/*Fica sempre rodando*/
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {/*Fica sempre rodando*/
				mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	
	
	
	private Thread thread1Time;
	private Thread thread2Time;
	
	
	public TelaTimeThread() {/*Executa o que tiver dentro no momento da abertura ou execução*/
		// TODO Auto-generated constructor stub
		setTitle("Minha tela de time com THREAD");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		
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
		mostraTempo.setEditable(false);
		jpanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jpanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		mostraTempo2.setEditable(false);
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
				
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButton2.setEnabled(true);
				jButton1.setEnabled(false);
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();
				
				jButton2.setEnabled(false);
				jButton1.setEnabled(true);
				
			}
		});
		
		jButton2.setEnabled(false);
		
		add(jpanel, BorderLayout.WEST); 
		setVisible(true);/*Torna a tela visivel para o usuário*/
	}

}









