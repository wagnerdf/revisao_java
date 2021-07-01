package estudosBasicos;

import javax.swing.JOptionPane;

public class EntradaDados3 {

	public static void main(String[] args) {
		
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoasNumero); /*4*/
	
		double resto = carroNumero % pessoasNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoa deu "+ divisao);
		}else {
			System.out.println("Não quiz ver o resultado");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é "+resto);
		}else {
			System.out.println("Não quiz ver o resultado");
		}
		
		
		
		

	}

}
