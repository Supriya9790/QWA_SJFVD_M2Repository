package assignment;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


import com.google.common.io.Files;

public class ActiTimeCreateAndDeleteUser {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://padmakar/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("TestEng");
		Thread.sleep(2000);
		driver.findElement(By.name("passwordText")).sendKeys("Ghodake");
		Thread.sleep(2000);
		WebElement dropdown1 = driver.findElement(By.name("active"));
		Select s1 = new Select(dropdown1);
		s1.selectByIndex(0);
		Thread.sleep(2000);
		driver.findElement(By.name("passwordTextRetype")).sendKeys("Ghodake");
		driver.findElement(By.name("firstName")).sendKeys("Supriya");
		driver.findElement(By.name("lastName")).sendKeys("Ghodake");
		//driver.findElement(By.name("middleName")).sendKeys("Dattatray");
		driver.findElement(By.name("email")).sendKeys("mukta123@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1123456678");
		WebElement dropdown2 = driver.findElement(By.name("timeZoneId"));
		Select s2 = new Select(dropdown2);
		s2.selectByIndex(0);
		Thread.sleep(2000);
		driver.findElement(By.name("workdayDurationStr")).sendKeys("8:00");
		driver.findElement(By.id("overtimeTracking_Enable")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("overtimeTrackingLevel")).click();
		driver.findElement(By.name("hireDateStr")).sendKeys("Jan 09, 2024");
		driver.findElement(By.name("rightGranted[9]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.xpath("//a[text()='Ghodake, Supriya (TestEng)']"));
		System.out.println(user.getText());
		user.click();
		
		driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
		Thread.sleep(10000);
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.dismiss();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/deleteUser.png");
		Files.copy(src, dest);
		driver.quit();

	}

}
