package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class WritingDataInExcelWithMethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		AllMethods m = new AllMethods();
		m.writeDataInExcel("./src/test/resources/TestData.xlsx", "Valid", 1, 2, "Pass");

	}

}
