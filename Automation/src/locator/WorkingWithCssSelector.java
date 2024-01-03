package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("FirstName")).sendKeys("Supriya");
		Thread.sleep(2000);
		driver.findElement(By.name("LastName")).sendKeys("Ghodake");
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("supriyaghodake4@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("Supriya@12");
		Thread.sleep(2000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Supriya@12");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
