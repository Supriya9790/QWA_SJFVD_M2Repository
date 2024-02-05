package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		Thread.sleep(20000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']")).click();
		Thread.sleep(2000);
		WebElement scrollTill = driver.findElement(By.name("(//input[@name='submit.add-to-cart'])[1]"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(false)", scrollTill);
		Set<String> all_id = driver.getWindowHandles();
		for(String id:all_id)
		{
	     	driver.switchTo().window(id);
	     	if (driver.getTitle().equals("https://www.amazon.in/Apple-iPhone-13-128GB-Starlight/dp/B09G9D8KRQ/ref=sr_1_1_sspa?keywords=Iphone&qid=1706155436&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1")) {
	     		break;
				
			}
		}
		driver.findElement(By.name("(//input[@name='submit.add-to-cart'])[1]")).click();
		
		
		
		

	}

}
