package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriver driver = new ChromeDriver();
		
		Point p = new Point(200,100);
		 
		driver.manage().window().setPosition(p);
		driver.quit();

	}

}
