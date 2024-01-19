package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

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

		for (int i = 0; i < 5; i++) 
		{
			Thread.sleep(2000);
			s.selectByIndex(i);
		}
		
		
		//get all selected options
       List<WebElement> allSelectedoptiopns = s.getAllSelectedOptions();
		
		for(WebElement option:allSelectedoptiopns)
		{
			System.out.println(option.getText());
		}

	}

}
