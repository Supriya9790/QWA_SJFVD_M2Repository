package batchExecution;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pompackage.AllMethods;
import pompackage.LoginPage;

public class InavalidLogin extends BaseTest{
	 @Test
	 public void InvalidLogin() throws EncryptedDocumentException, IOException
	 {
		 AllMethods m = new AllMethods();
			//get row count
		    int count = m.getRowCount(EXCELPATH, INVALIDSHEETNAME);
			System.out.println(count);
			
			for(int i = 1; i<=count;i++)
			{
				String username = m.getDataFromExcel(EXCELPATH, INVALIDSHEETNAME, i,0);
				String password = m.getDataFromExcel(EXCELPATH,INVALIDSHEETNAME, i,1);
				WebElement username1 = driver.findElement(By.name("username"));
				username1.sendKeys(username);
			    WebElement password1 = driver.findElement(By.name("pwd"));
				password1.sendKeys(password);
				username1.clear();
				password1.clear();
				
			    
			}
	        
			
	    	
	 }
	 
	
	 
	
	
	
	
	

}
