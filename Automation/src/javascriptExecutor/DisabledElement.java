package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('name').value='Supriya Ghodake';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email').value='supriyaghodake4@gmail.com';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('password').value='Supriya123';");
		Thread.sleep(2000);
		WebElement disabledButton = driver.findElement(By.xpath("//button[text()='Register']"));
		js.executeScript("arguments[0].click()", disabledButton);
		driver.quit();

	}

}
