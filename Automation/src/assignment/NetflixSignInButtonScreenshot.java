package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class NetflixSignInButtonScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.id("id_userLoginId")).sendKeys("supriya12@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("123456");
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		File src = signIn.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/NetflixSignIn.png");
		Files.copy(src, dest);
		driver.quit();

	}

}
