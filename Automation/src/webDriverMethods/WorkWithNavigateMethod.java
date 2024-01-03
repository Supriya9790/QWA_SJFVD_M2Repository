package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithNavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		//use to()
		driver.navigate().to("https://www.swiggy.com/city/pune");
		//go back
		Thread.sleep(2000);
		driver.navigate().back();
		//go forword
		Thread.sleep(2000);
		driver.navigate().forward();
		//do refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.quit();

	}

}
