package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("requiredfield")).sendKeys("wertyui");
		Thread.sleep(2000);
		driver.findElement(By.name("minLength")).sendKeys("asdfghjk");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("supriya");
		Thread.sleep(2000);
		driver.findElement(By.name("maxLength")).sendKeys("fyghbj");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmpass")).sendKeys("supriya");
		Thread.sleep(2000);
		driver.findElement(By.name("rangeLength")).sendKeys("tyuij");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("supriyaghodake4@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("minValue")).sendKeys("7");
		Thread.sleep(2000);
		driver.findElement(By.name("url")).sendKeys("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("maxValue")).sendKeys("4");
		Thread.sleep(2000);
		driver.findElement(By.name("digits")).sendKeys("486333");
		Thread.sleep(2000);
		driver.findElement(By.name("rangeValue")).sendKeys("13");
		Thread.sleep(2000);
		driver.findElement(By.name("number")).sendKeys("217777855");
		Thread.sleep(2000);
		driver.findElement(By.name("alphanum")).sendKeys("A1B2C3@#");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
