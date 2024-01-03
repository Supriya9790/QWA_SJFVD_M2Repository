package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://padmakar/login.do");
		Thread.sleep(2000);
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		Thread.sleep(2000);
		System.out.println(checkBox.isSelected());
		Thread.sleep(2000);
		driver.quit();
	}

}
