package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando2 {
	
	public static void main(String[] args) throws Exception{
		
		File file = new File("D:\\Documentos\\Projetos programação\\ws-eclipse\\curso_programacao\\src\\arquivos\\arquivo_excel.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfworkbook = new HSSFWorkbook(entrada); /*Prepara a entrada do arquivo xls excel*/
		HSSFSheet planilha = hssfworkbook.getSheetAt(0);/*pegando a planilha*/
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while(linhaIterator.hasNext()) {/*Enquanto tiver linha*/
			Row linha = linhaIterator.next();/*Dados da pessoa na linha*/
			
			String valorCelula = linha.getCell(0).getStringCellValue();
			
			linha.getCell(0).setCellValue(valorCelula+" * valor gravado na aula *");
			
			
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfworkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha atualizada");
		
		hssfworkbook.close();
	}

}
