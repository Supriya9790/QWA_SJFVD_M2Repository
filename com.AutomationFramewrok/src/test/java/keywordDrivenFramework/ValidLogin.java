package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//create object of basetest class to call the method
		BaseTest test = new BaseTest();
		test.setup();
		
		//create the object of allMethods class to call the methods 
		AllMethods a = new AllMethods();
		String username = a.getDataFromPropery(PROPPATH, "Username");
		String password = a.getDataFromPropery(PROPPATH, "Password");
		
		//valid login
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		//close Browser
		test.tearDown();
	}
	

}
