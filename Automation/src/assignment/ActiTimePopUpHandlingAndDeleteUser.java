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

import com.google.common.io.Files;

public class ActiTimePopUpHandlingAndDeleteUser {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();

		d.manage().window().maximize();

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		d.get("http://padmakar/user/submit_tt.do");

		d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);

		d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);

		d.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);

		d.findElement(By.xpath("//a[@class='content users']")).click();
		Thread.sleep(2000);

		d.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(2000);

		d.findElement(By.xpath("//input[@name='username']")).sendKeys("Singer");
		Thread.sleep(2000);

		d.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("TE");
		Thread.sleep(2000);

		d.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("TE");
		Thread.sleep(2000);

		d.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Supriya");
		Thread.sleep(2000);

		d.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Ghodake");
		Thread.sleep(2000);

		// to remove space we can also use contains by attribute xpath
		d.findElement(By.xpath("//input[contains(@value,'Create User')]")).click();
		Thread.sleep(2000);

		WebElement user = d.findElement(By.xpath("//a[text()='Ghodake, Supriya (Singer)']"));
		System.out.println(user.getText());
		user.click();

		d.findElement(By.xpath("//input[@value='Delete This User']")).click();
		Thread.sleep(2000);

		// Confirm Popup
		Alert alt = d.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();

		Thread.sleep(2000);
		// Take Screenshot
		TakesScreenshot ts = (TakesScreenshot)d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/DeleteUserConfirmPopup.png");
		Files.copy(src, dest);
		}
		




	}


