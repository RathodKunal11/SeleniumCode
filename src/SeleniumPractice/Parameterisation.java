package SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterisation {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing training\\Automation testing\\Selenium\\21st may batch.xlsx");
		String excel = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(excel);
	}

}
