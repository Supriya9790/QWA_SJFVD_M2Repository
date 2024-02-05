package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//create the object of FileInputStream and pass the path
      FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
      
      //Open the workbook in readable mode
      Workbook book = WorkbookFactory.create(fis);
      
      //get sheet
      Sheet sheet = book.getSheet("Valid");
      
      //get the row
      Row row = sheet.getRow(1);
      
      //get the cell
      Cell cell = row.getCell(0);
      
      //get Username
      String username = cell.getStringCellValue();
      System.out.println(username);

	}

}
