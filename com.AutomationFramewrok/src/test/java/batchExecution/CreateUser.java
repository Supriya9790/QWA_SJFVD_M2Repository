package batchExecution;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateUser extends BaseTest {
      
		
		@Test
		public void createUser() throws InterruptedException
		{
		LoginActitime a = new LoginActitime();
		a.login();
		Random r = new Random();
		int no = r.nextInt(10);
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TestEngg");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("Password@123");
		WebElement d1 = driver.findElement(By.xpath("//select[@name='active']"));
		Select s = new Select(d1);
		s.selectByVisibleText("enabled");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("amir");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Khan");
		driver.findElement(By.xpath("//input[@name='overtimeTracking']")).click();
		driver.findElement(By.id("ext-gen20")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	}

		


	

}
