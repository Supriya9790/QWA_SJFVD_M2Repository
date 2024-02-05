package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Acer Swift Go 14')]")).click();
		WebElement price = driver.findElement(By.xpath("//span[contains(text(),'Acer Swift Go 14')]/ancestor::div[@class='aMaAEs']/descendant::div[@class='dyC4hf']/descendant::div[@class='CEmiEU']/descendant::div[contains(text(),'₹84,990')]"));
        System.out.println(price.getText());
	}

}
