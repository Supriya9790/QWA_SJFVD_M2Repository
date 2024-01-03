package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://padmakar/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Bank Of India");
		Thread.sleep(2000);
		driver.findElement(By.id("pre_fill_blank")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("active_customers_action")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("createCustomerSubmit")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
