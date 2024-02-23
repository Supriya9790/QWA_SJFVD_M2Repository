package designBaseTestUsingAnnotation;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateUser extends BaseTest {
      
		
		@Test
		public void createUser() throws InterruptedException
		{
		Random r=new Random();
		int rm=r.nextInt(100)+1;
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SK");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("Supriya1234");
	    driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("Supriya1234");
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Arijit");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Singh"+rm);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='overtimeTracking']")).click();
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		Reporter.log("User Created Successfully");
		}


	

}
