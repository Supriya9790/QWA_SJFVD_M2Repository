package HandlingPopUpByUsingAutoIT;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriUploadResume {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("name")).sendKeys("Supriya");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("supriya12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Password@123");
		Thread.sleep(2000);
		driver.findElement(By.id("mobile")).sendKeys("12345677890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//h2[@class='main-3'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./AutoIT/NaukriUploadResume.exe");

	}

}
