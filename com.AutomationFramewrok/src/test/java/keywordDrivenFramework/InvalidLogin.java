package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BaseTest test = new BaseTest();
		test.setup();
		
		//create the object of allMethods class to call the methods 
		AllMethods a = new AllMethods();
		String username = a.getDataFromPropery(PROPPATH, "InUsername");
		String password = a.getDataFromPropery(PROPPATH, "InPassword");
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		//close Browser
		test.tearDown();

	}

}
