package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class YatraHandlePopupAndSerachFlight {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		Thread.sleep(2000);
		
		//click on hotel
		driver.findElement(By.id("booking_engine_hotels")).click();
		Thread.sleep(2000);
		
		//pass destination
		WebElement destination = driver.findElement(By.id("BE_hotel_destination_city"));
        destination.click();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_P);
        r.keyPress(KeyEvent.VK_U);
        r.keyRelease(KeyEvent.VK_U);
        r.keyPress(KeyEvent.VK_N);
        r.keyRelease(KeyEvent.VK_N);
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        Thread.sleep(2000);
       // r.keyPress(KeyEvent.VK_DOWN);
       // r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        
        //checkin checkout
        driver.findElement(By.id("BE_hotel_checkin_date")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("23/01/2024")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("25/01/2024")).click();
        Thread.sleep(2000);
        
        //traveller and hotel
        driver.findElement(By.xpath("//label[text()='Traveller and Hotel']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[2]")).click();
        Thread.sleep(2000);
        
        //add age
        WebElement age = driver.findElement(By.xpath("//select[@class='ageselect']"));
        age.click();
        Select s = new Select(age);
        s.selectByIndex(12);
        
        //click on search
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        
        
        
        
        
        
        
	}

}
