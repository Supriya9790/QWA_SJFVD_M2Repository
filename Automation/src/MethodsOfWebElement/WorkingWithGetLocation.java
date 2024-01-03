package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetLocation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://padmakar/login.do");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		Point loc = username.getLocation();
		Thread.sleep(2000);
		System.out.println(loc);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
