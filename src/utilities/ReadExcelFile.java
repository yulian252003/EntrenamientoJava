package utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws FileNotFoundException {
	
		//Crea un flujo de entrada para leer el archivo excel desde el disco
		FileInputStream readFile = new FileInputStream("sampleTest.xlsx");
		
		//Abre el archivo excel usando un try-with-resource
		try(XSSFWorkbook workbook = new XSSFWorkbook(readFile)){
			
			//Obtiene la hoja del libro con el nombre "sampleShee"
			XSSFSheet sheet = workbook.getSheet("SampleSheet");
			
			//Declara variables para recorrer filas y celdas
			Row row;
			Cell cell;
			
			//Obtiene un iterador para recorrer todas las filas de la hoja
			Iterator<Row> rowIterator = sheet.iterator();
			
			//Comienz el recorrido de las filas
			while (rowIterator.hasNext()) {
				row = rowIterator.next(); //obtiene la siguiente fila
				
				//Crea un iterador para recorrer todas las celdas de esa fila
				Iterator<Cell> cellIterator = row.cellIterator();
				
				//Recorre todas las celdas de la fila actual
				while (cellIterator.hasNext()){
					cell = cellIterator.next(); //obtiene la siguiente celda.
					
					//Usa un formatedor para obtener el valor de la celda como texto,
					//Sin impor si es numero, texto, formulas
					DataFormatter formatter = new DataFormatter();
					String text = formatter.formatCellValue(cell);
					
					//imprima el valor de la celda en consola
					System.out.println(text);
				}
			}
		
	}catch (IOException e) {
		System.out.println("Ojo con el error"); //Mensaje personalizado
		e.printStackTrace();
	}

}
}