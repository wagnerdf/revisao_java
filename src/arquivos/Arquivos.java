package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("Wagner Andrade");		
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(35);
		pessoa2.setNome("Marina Amorim");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(25);
		pessoa3.setNome("Raquel Rios");
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setEmail("pessoa4@gmail.com");
		pessoa4.setIdade(17);
		pessoa4.setNome("Bruna Rios");
		
		/*Pode vir do banco de dados ou qualquer fonte de dados*/
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		
		File arquivo = new File("D:\\Documentos\\Projetos programação\\ws-eclipse\\curso_programacao\\src\\arquivos\\arquivo.csv");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		
		for(Pessoa p : pessoas) {
			
			escrever_no_arquivo.write(p.getNome()+";"+p.getIdade()+";"+p.getEmail()+"\n");
			
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();

	}

}
