package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginActitimeAssignment {
	
		static WebDriver driver;
			@Test(priority=1)
			public void login()
			{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://padmakar/login.do");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Reporter.log("Login Successfull",true);

			}

			@Test(dependsOnMethods = "login")
			public void createUser() throws InterruptedException
			{
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			driver.findElement(By.xpath("//input[@value='Create New User']")).click();
			        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Ak");
			        driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("A1234");
			        driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("A1234");
			        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Akshay");
			        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
			        Thread.sleep(2000);
			        driver.findElement(By.xpath("//input[@name='overtimeTracking']")).click();
			        driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
			Reporter.log("User Created Successfully");
			}

			@Test(priority = 2)
			public void logout()
			{
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Reporter.log("Logout Successfull");

			}

			


	}


