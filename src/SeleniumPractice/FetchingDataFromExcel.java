package SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		
		String excelFilePath="C:\\Users\\user\\eclipse-workspace\\Selenium\\TestData\\TestData.xlsx";
		
		FileInputStream inputStream=new FileInputStream(excelFilePath);
		Sheet sheet = WorkbookFactory.create(inputStream).getSheet("Sheet1");
		
		//using for loop
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<=rows;r++) {
			
			Row row = sheet.getRow(r);
			for(int c=0;c<cols;c++) {
				Cell cell = row.getCell(c);
				switch(cell.getCellType())
				{
				case STRING: System.out.println(cell.getStringCellValue());break;
				case NUMERIC: System.out.println(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
				}
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
