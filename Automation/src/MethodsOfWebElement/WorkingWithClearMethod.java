package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://padmakar/login.do");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		username.sendKeys("admin");
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("admin123");
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
