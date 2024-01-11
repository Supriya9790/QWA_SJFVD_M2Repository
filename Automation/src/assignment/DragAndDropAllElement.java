package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAllElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		Thread.sleep(2000);
		WebElement drag1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		Thread.sleep(2000);
		WebElement drop1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Thread.sleep(2000);
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drag1, drop1).perform();
		Thread.sleep(2000);
		WebElement drag2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		Thread.sleep(2000);
		WebElement drop2 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Thread.sleep(2000);
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(drag2, drop2).perform();
		Thread.sleep(2000);
		WebElement drag3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		Thread.sleep(2000);
		WebElement drop3 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Thread.sleep(2000);
		Actions act3 = new Actions(driver);
		act2.dragAndDrop(drag3, drop3).perform();
		Thread.sleep(2000);
		WebElement drag4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		Thread.sleep(2000);
		WebElement drop4 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Thread.sleep(2000);
		Actions act4 = new Actions(driver);
		act2.dragAndDrop(drag4, drop4).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
