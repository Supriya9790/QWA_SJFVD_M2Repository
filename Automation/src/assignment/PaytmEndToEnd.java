package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class PaytmEndToEnd {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		WebElement scrollTill = driver.findElement(By.xpath("(//div[@class='_2EGQY'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",scrollTill);
		
		scrollTill.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.id("text-box")).sendKeys("PNQ");
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("to")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.id("text-box")).sendKeys("DEL");
		driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='26'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("travellerClass")).click();
		for(int i = 0;i<2;i++)
		{
			driver.findElement(By.xpath("(//img[@alt='add-icon'])[1]")).click();
			Thread.sleep(2000);
		}
		driver.findElement(By.id("flightSearch")).click();
		List<WebElement> allFlights = driver.findElements(By.xpath("//div[@class='_5Cbbf']"));
		for(WebElement flight:allFlights)
		{
			System.out.println(flight.getText());
			System.out.println("---------------------------------------");
		}
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/paytm.png");
		Files.copy(src, dest);
		driver.quit();
		

	}

}
