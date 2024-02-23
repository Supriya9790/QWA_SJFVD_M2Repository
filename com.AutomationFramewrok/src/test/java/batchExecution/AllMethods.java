package batchExecution;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllMethods {

       //method for fetching data from property file
		public String getDataFromPropery(String Path ,String Key) throws IOException
		{
			FileInputStream fis = new FileInputStream(Path);
			Properties prop = new Properties();
			prop.load(fis);
			String value = prop.getProperty(Key);
			return value;
			
		}
		
		//method for fetching the data from excel file
		public String getDataFromExcel(String path,String sheet,int row,int cell) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet1 = book.getSheet(sheet);
			Row row1 = sheet1.getRow(row);
			Cell cell1 = row1.getCell(cell);
			String value = cell1.getStringCellValue();
		    return value;
		}
		
		//method for writing the data from excel
		public void writeDataInExcel(String path,String sheet,int row,int cell,String value) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet1 = book.getSheet(sheet);
			Row row1 = sheet1.getRow(row);
			Cell cell1 = row1.createCell(cell);
			cell1.setCellValue(value);
			FileOutputStream fos = new FileOutputStream(path);
			book.write(fos);
			System.out.println("sent successfully");
			
		}
		
		//Method to check how many rows are there in excel
		public int getRowCount(String path,String sheet) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet1 = book.getSheet(sheet);
			int count = sheet1.getLastRowNum();
			return count;
			
		}

}


