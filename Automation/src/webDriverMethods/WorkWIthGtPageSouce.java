package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWIthGtPageSouce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
		
		//launch flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	    String pageSource = driver.getPageSource();
	    System.out.println(pageSource);
	}

}
