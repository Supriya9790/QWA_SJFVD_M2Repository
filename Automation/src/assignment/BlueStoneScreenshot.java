package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class BlueStoneScreenshot {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gad_source=1&gclid=Cj0KCQiAnfmsBhDfARIsAM7MKi0dJBuh5ZE2P7ejYLaFUC2cUyav4ZUajC4QqX29laYoYRQltIh3uPIaApBzEALw_wcB");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(coins).perform();
	
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Coins by Design']"))).perform();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/bluestonecoins.png");
		Files.copy(src, dest);
		driver.quit();
		

	}

}
