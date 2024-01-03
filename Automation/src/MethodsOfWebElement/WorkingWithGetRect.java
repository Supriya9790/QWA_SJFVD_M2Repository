package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetRect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://padmakar/login.do");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		Rectangle rect = username.getRect();
		Thread.sleep(2000);
		int height = rect.getHeight();
		Thread.sleep(2000);
		int width = rect.getWidth();
		Thread.sleep(2000);
		System.out.println("height is:"+height);
		Thread.sleep(2000);
		System.out.println("width is:"+width);
		Thread.sleep(2000);
		int x = rect.getX();
		Thread.sleep(2000);
		int y = rect.getY();
		Thread.sleep(2000);
		System.out.println("x axis:"+x);
		Thread.sleep(2000);
		System.out.println("y axis:"+y);
		
	}

}
