package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FireFlinkSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.fireflink.com/");
		Thread.sleep(2000);
		
		//click on signup button
		WebElement signin = driver.findElement(By.xpath("//a[text()='Sign In']"));
		Actions act = new Actions(driver);
		act.moveToElement(signin).click().perform();
		Thread.sleep(2000);
		
		//pass email
		driver.findElement(By.id("mui-1")).sendKeys("supriyaghodake49@gmail.com");
		
		//pass password
		driver.findElement(By.id("mui-2")).sendKeys("Supriya@123");
		
		//signin
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

	}

}
