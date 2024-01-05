package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoApps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		WebElement d1 = driver.findElement(By.id("select1"));
		Select s1 = new Select(d1);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		WebElement d2 = driver.findElement(By.id("select2"));
		Select s2 = new Select(d2);
		s2.selectByIndex(2);
		Thread.sleep(2000);
		WebElement d3 = driver.findElement(By.id("select3"));
		Select s3 = new Select(d3);
		s3.selectByIndex(2);
		Thread.sleep(2000);
		//WebElement d4 = driver.findElement(By.id("select5"));
		//Select s4 = new Select(d4);
		//s4.selectByIndex(5);
		//Thread.sleep(2000);
		//WebElement d5 = driver.findElement(By.id("optionCity"));
		//Select s5 = new Select(d5);
		//s5.selectByVisibleText("Select City");
		//Thread.sleep(2000);
		WebElement d6 = driver.findElement(By.id("select7"));
		Select s6 = new Select(d6);
		s6.selectByValue("5");
		Thread.sleep(2000);
		driver.quit();

	}

}
