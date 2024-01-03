package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vistara {
                
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Accept All')]")).click();
		//driver.findElement(By.id("pay_cash_option")).click();
		driver.findElement(By.name("flightSearchFrom")).sendKeys("PNQ");
		Thread.sleep(2000);
		driver.findElement(By.name("flightSearchTo")).sendKeys("DEL");
		Thread.sleep(2000);
		driver.findElement(By.name("depart")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='28']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='30']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("passengers")).sendKeys("Adult:1 Travel:economy");
		driver.findElement(By.id("book-flight-widget")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
