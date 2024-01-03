package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://padmakar/login.do");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		System.out.println(username.isEnabled());
		Thread.sleep(2000);
		driver.quit();
	}

}
