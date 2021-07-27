package arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D:\\Documentos\\Projetos programa��o\\ws-eclipse\\curso_programacao\\src\\arquivos\\arquivo_excel.xls");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
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
		
		Pessoa pessoa5 = new Pessoa();
		pessoa5.setEmail("pessoa5@gmail.com");
		pessoa5.setIdade(22);
		pessoa5.setNome("Mario Vesco");
		
		/*Pode vir do banco de dados ou qualquer fonte de dados*/
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		pessoas.add(pessoa5);
		
		HSSFWorkbook hssfworkbook = new HSSFWorkbook(); /*vai ser usado para escrever na planilha*/
		HSSFSheet linhasPessoas = hssfworkbook.createSheet("Planilha de pessoas - Treinamento");/*criar planilha*/
		
		
		int numeroLinha = 0;
		for (Pessoa p : pessoas) {
			Row linha = linhasPessoas.createRow(numeroLinha ++);/*Criar a linha na planilha*/
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula ++);/*Celula 1*/
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula ++);/*Celula 2*/
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula ++);/*Celula 3*/
			celIdade.setCellValue(p.getIdade());	
		}/*Terminou de montar a planilha*/
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfworkbook.write(saida);/*Escreve planilha em arquivo*/
		saida.flush();
		saida.close();
		
		System.out.println("Planilha foi criada");
	}
}






