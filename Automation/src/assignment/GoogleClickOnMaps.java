package assignment;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleClickOnMaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.google.co.in/");
	    driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	    Thread.sleep(2000);
	    
	    driver.switchTo().frame("app");
	    
	    driver.findElement(By.xpath("//span[text()='Maps']")).click();
	    
      
	}

}
