package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetWrappedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/WCSM9WebElement/Movies.html");
		WebElement dropdown = driver.findElement(By.id("Dropdown"));
		Select s = new Select(dropdown);
		WebElement allOptions = s.getWrappedElement();
		System.out.println(allOptions.getText());

	}

}
