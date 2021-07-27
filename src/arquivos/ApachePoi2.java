package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class ApachePoi2 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream entrada = new FileInputStream(new File("D:\\Documentos\\Projetos programa��o\\ws-eclipse\\curso_programacao\\src\\arquivos\\arquivo_excel.xls"));
		
		HSSFWorkbook hssfworkbook = new HSSFWorkbook(entrada);/*Prepara a entrada do arquivo excel para ler*/
		HSSFSheet planilha = hssfworkbook.getSheetAt(0);/*Pega a primeira planilha do nosso arquivo excel*/
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while (linhaIterator.hasNext()) {/*Enquanto tiver linha no arquivo excel*/
			
			Row linha = linhaIterator.next();/*Dados da pessoas na linha*/
			
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa pessoa =  new Pessoa();
			
			while(celulas.hasNext()) {/*Pecorrer as celulas*/
				Cell cell = celulas.next();
				
				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				}
			}/*Fim das celula da linha*/
			
			pessoas.add(pessoa);
		}	
		entrada.close();/*Terminou de ler o arquivo excel*/
		
		for(Pessoa pessoa : pessoas) {/**/
			System.out.println(pessoa);
		}
		
		hssfworkbook.close();
		
	}
}






