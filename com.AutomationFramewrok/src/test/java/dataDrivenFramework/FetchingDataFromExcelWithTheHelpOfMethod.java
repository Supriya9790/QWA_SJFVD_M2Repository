package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class FetchingDataFromExcelWithTheHelpOfMethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		AllMethods m = new AllMethods();
		m.getDataFromExcel("./src/test/resources/TestData.xlsx", "Valid", 1, 0);
		

	}

}
