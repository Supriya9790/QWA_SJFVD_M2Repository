package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMehods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(2000);
		
		//handle dropdown
		WebElement dropdown = driver.findElement(By.id("select3"));
		Thread.sleep(2000);
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("Germany");
		Thread.sleep(2000);
		s.selectByVisibleText("China");
		Thread.sleep(2000);
		driver.quit();

	}

}
