package batchExecution;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import dataDrivenFramework.AllMethods;

public class BaseTest implements IAutoConstant {

   static WebDriver driver;
	
   @BeforeClass
	public void setup() throws IOException
	{
		AllMethods method = new AllMethods();
		String browser = method.getDataFromPropery(PROPPATH, "Browser");
		String url = method.getDataFromPropery(PROPPATH, "Url");
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equals("Edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECOND));
		driver.get(url);
	}
	
    @BeforeMethod(enabled  = false)
	public void login( )
	 {
	 driver.get("http://padmakar/login.do"); // Actitime
	 driver.findElement(By.name("username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	 }
    
	
	 @AfterMethod
	// public void logout()
	 //{
	// driver.findElement(By.xpath("//a[text()='Logout']")).click();
	// }
	
	 @AfterClass
	 // Method to Close the Browser
    public void tearDown()
	{
		driver.quit();
	}

}
