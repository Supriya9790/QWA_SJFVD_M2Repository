package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Supriya");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("ghodake");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("supriya12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sup@123");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("sup@123");
		Thread.sleep(2000);
		WebElement d1 = driver.findElement(By.id("day"));
		Select s1 = new Select(d1);
		s1.selectByIndex(4);
		Thread.sleep(2000);
		WebElement d2 = driver.findElement(By.id("month"));
		Select s2 = new Select(d2);
		s2.selectByIndex(2);
		Thread.sleep(2000);
		WebElement d3 = driver.findElement(By.id("year"));
		Select s3 = new Select(d3);
		s3.selectByIndex(5);
		Thread.sleep(2000);
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
