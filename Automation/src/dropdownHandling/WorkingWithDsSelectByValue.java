package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDsSelectByValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		Thread.sleep(2000);
		Select s = new Select(dropdown);
		s.selectByValue("India");
		s.selectByValue("United Kingdom");
		Thread.sleep(2000);
		s.deselectByValue("India");
		s.deselectByValue("United Kingdom");
		Thread.sleep(2000);

	}

}
