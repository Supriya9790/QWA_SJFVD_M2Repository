package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithContextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/button/buttonRightClick?sublist=1");
		
		//create the object of actions class
		Actions act = new Actions(driver);
		
		//use context click method
		act.contextClick(driver.findElement(By.id("btn30"))).perform();
		
		driver.quit();

	}

}
