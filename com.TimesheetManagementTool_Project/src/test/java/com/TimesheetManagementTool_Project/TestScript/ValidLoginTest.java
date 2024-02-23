package com.TimesheetManagementTool_Project.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TimesheetManagementTool_Project.GenericLib.BaseTest;
import com.TimesheetManagementTool_Project.GenericLib.CustomerListner;
import com.TimesheetManagementTool_Project.GenericLib.Flib;
import com.TimesheetManagementTool_Project.PomPages.LoginPage;


@Listeners(CustomerListner.class)
public class ValidLoginTest extends BaseTest {
	
	@Test
	public void login() throws EncryptedDocumentException, IOException {
		
		
		Flib lib = new Flib();
		String username = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoActitime(username, password);
	}
	
	
}
