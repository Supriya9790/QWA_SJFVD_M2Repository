package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dataDrivenFramework.AllMethods;

public class BaseTest implements IAutoConstant {

   static WebDriver driver;
	
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
	
	public void tearDown()
	{
		driver.quit();
	}

}
