package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class RowCountWithTheHelpOfMethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		AllMethods m = new AllMethods();
		int count = m.getRowCount("./src/test/resources/TestData.xlsx", "valid");
		System.out.println(count);

	}

}
