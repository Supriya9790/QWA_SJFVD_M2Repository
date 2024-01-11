package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleInspectWIthForLoop {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		Actions act = new Actions(driver);
		act.contextClick().perform();
		
		Robot r = new Robot();
		for(int i = 0;i<=10;i++)
		{
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyPress(KeyEvent.VK_END);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		}

	}


