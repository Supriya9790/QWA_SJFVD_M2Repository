package com.TimesheetManagementTool_Project.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.TimesheetManagementTool_Project.GenericLib.BaseTest;
import com.TimesheetManagementTool_Project.GenericLib.Flib;
import com.TimesheetManagementTool_Project.GenericLib.WorkLib;
import com.TimesheetManagementTool_Project.PomPages.CreateNewProjectPage;
import com.TimesheetManagementTool_Project.PomPages.HomePage;
import com.TimesheetManagementTool_Project.PomPages.LoginPage;
import com.TimesheetManagementTool_Project.PomPages.OpenTasks;
import com.TimesheetManagementTool_Project.PomPages.ProjectAndCustomerPage;

public class CreateCustomerAndProjectTest extends BaseTest {
	
	@Test
	public void createCustomerAndProject() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//login in application
		String username = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoActitime(username, password);
		
		//click on task tab
		HomePage hp = new HomePage(driver);
		hp.clickOnTasksLink();
		
		//click on project and customer 
		OpenTasks ot = new OpenTasks(driver);
		ot.clickOnProjectAndCustomer();
		Thread.sleep(2000);
	
		
		//click on create new customer button
		ProjectAndCustomerPage pcp = new ProjectAndCustomerPage(driver);
		Thread.sleep(2000);
		pcp.clickOnCreateNewCustomer();
		
		//fetching the data
		Flib lib = new Flib();
		Thread.sleep(2000);
		WorkLib wlib = new WorkLib();
		Thread.sleep(2000);
		String customerName = lib.getDataFromExcelFile(EXCELPATH, CUSTOMERSHEET, 1, 0)+wlib.randomNo();
		Thread.sleep(2000);
		String projectName = lib.getDataFromExcelFile(EXCELPATH, CUSTOMERSHEET, 1, 1)+wlib.randomNo();
		Thread.sleep(2000);
		
		//create customer and project
		CreateNewProjectPage page = new CreateNewProjectPage(driver);
		Thread.sleep(2000);
		page.createProject(customerName, projectName, driver);
		
		

}

}
