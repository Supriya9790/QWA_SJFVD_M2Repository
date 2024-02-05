package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchControlFromFrameToMainPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.dream11.com/");
	    driver.switchTo().frame("send-sms-iframe");
	    driver.findElement(By.id("regEmail")).sendKeys("1234567890");
	    driver.switchTo().defaultContent();
	   

	}

}
