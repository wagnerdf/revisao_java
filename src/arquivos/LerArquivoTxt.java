package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream entradaArquivo = 
				new FileInputStream(new File("D:\\Documentos\\Projetos programa��o\\ws-eclipse\\curso_programacao\\src\\arquivos\\arquivo.txt"));
		
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		while (lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			
			if(linha != null && !linha.isEmpty()) {
				System.out.println(linha);
			}
		}
		

	lerArquivo.close();	
		
	}

}
