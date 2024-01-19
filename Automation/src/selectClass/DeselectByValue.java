package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");

		// identify multi-select dropdown
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));

		// create the object of select class
		Select s = new Select(dropdown);

		s.selectByValue("India");

		s.selectByValue("United States");

		Thread.sleep(2000);
		
		//deselect the option by using deselect by value
		s.deselectByValue("India");

		s.deselectByValue("United States");
		driver.quit();

	}

}
