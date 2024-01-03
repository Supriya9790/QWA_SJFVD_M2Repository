package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("supriyaghodake4@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Supriya@12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Log in\"]")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
		}

}
