package com.TimesheetManagementTool_Project.GenericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseTest implements IAutoConstant{
	
	public WebDriver driver;
	public static WebDriver sdriver;
	public Flib lib;
	
	@Parameters("browser")
	@BeforeClass()
	public void launchBrowser(@Optional("chrome") String browser) throws IOException {
		lib = new Flib();
		//String browser = lib.getDataFromPropertyFile(PROPPATH,"Browser");
	
		String url = lib.getDataFromPropertyFile(PROPPATH,"Url");
		
		Reporter.log("Launching"+browser+"browser",true);
		
		if(browser.equals("chrome"))
  	   {
  		  driver = new ChromeDriver();
  		  driver.manage().window().maximize();
  	   }
  	   else if(browser.equals("edge"))
  	   {
  		  driver = new EdgeDriver();
  		  driver.manage().window().maximize();
  	   }
	   else 
	   {
			Reporter.log("Invalid Browser",true);
	   }
		sdriver = driver;
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);
		
	}
	
	@AfterClass()
	public void closeBrowser()
	{
		driver.quit();
	}

}
