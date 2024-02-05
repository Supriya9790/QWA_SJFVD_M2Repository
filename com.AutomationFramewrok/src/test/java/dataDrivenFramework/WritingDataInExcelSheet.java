package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataInExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		
		//Open the workbook in readable mode
		Workbook book = WorkbookFactory.create(fis);
		
	    Sheet sheet = book.getSheet("Valid");
	    
	    Row row = sheet.getRow(1);
	    
	    Cell cell = row.createCell(2);
	    
	    //pass the value
	    cell.setCellValue("Pass");
	    
	    //open the workbook in writable mode and save it
	    FileOutputStream fos = new FileOutputStream("./src/test/resources/TestData.xlsx");
	    book.write(fos);
	    

	}

}
