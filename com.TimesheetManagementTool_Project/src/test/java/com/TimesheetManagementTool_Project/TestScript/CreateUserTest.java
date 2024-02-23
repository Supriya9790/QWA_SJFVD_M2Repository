package com.TimesheetManagementTool_Project.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.TimesheetManagementTool_Project.GenericLib.BaseTest;
import com.TimesheetManagementTool_Project.GenericLib.WorkLib;
import com.TimesheetManagementTool_Project.PomPages.CreateNewUserPage;
import com.TimesheetManagementTool_Project.PomPages.CreateUserPage;
import com.TimesheetManagementTool_Project.PomPages.HomePage;
import com.TimesheetManagementTool_Project.PomPages.LoginPage;

public class CreateUserTest extends BaseTest{
	
	@Test
	public void createUser() throws EncryptedDocumentException, IOException {

	String username = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
	String password = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
	LoginPage lp = new LoginPage(driver);
	lp.loginIntoActitime(username, password);
	HomePage hp = new HomePage(driver);
	hp.clickOnUserLink();
	CreateUserPage cup = new CreateUserPage(driver);
	cup.clickOnCreateNewUser();
	CreateNewUserPage cnw = new CreateNewUserPage(driver);
	WorkLib wlib = new WorkLib();
	String username1 = lib.getDataFromExcelFile(EXCELPATH, USERSHEETNAME, 1, 0);
	String password1 = lib.getDataFromExcelFile(EXCELPATH, USERSHEETNAME, 1, 1);
	String fn = lib.getDataFromExcelFile(EXCELPATH, USERSHEETNAME, 1, 2);
	String ln = lib.getDataFromExcelFile(EXCELPATH, USERSHEETNAME, 1, 3);
	cnw.createUser(username1 + wlib.randomNo(), password1 + wlib.randomNo(), fn + wlib.randomNo(),ln + wlib.randomNo());
	}
}
