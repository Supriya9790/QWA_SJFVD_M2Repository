package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopperStackEndToEndScenario {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("supriyaghodake49@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Supriya@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		WebElement men = driver.findElement(By.xpath("//a[@id='men']"));
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.moveToElement(men).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Shirts']")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='add to cart'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cart")).click();
		
		
		

	}

}
