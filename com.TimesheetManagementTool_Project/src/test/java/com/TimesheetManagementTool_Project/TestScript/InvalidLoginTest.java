package com.TimesheetManagementTool_Project.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.TimesheetManagementTool_Project.GenericLib.BaseTest;
import com.TimesheetManagementTool_Project.GenericLib.Flib;
import com.TimesheetManagementTool_Project.PomPages.LoginPage;

public class InvalidLoginTest extends BaseTest {
	
	@Test
	public void invalidLogin() throws EncryptedDocumentException, IOException {
		Flib lib = new Flib();
		int rowCount = lib.getRowCount(EXCELPATH, INVALIDSHEETNAME);
		for (int i = 1; i <= rowCount; i++) {
			String username = lib.getDataFromExcelFile(EXCELPATH, INVALIDSHEETNAME, i, 0);
			String password = lib.getDataFromExcelFile(EXCELPATH, INVALIDSHEETNAME, i, 1);
			LoginPage lp = new LoginPage(driver);
			lp.invalidLoginIntoActitime(username, password);

		}
	}

}
