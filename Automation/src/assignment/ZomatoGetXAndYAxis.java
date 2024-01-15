package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoGetXAndYAxis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/india");
		//driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		WebElement blinkit = driver.findElement(By.xpath("//p[text()='Blinkit']"));
		Rectangle rect = blinkit.getRect();
		int x = rect.getX();
		int y = rect.getY();
		System.out.println(x);
		System.out.println(y);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}

}
