package assignment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElementsFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'Pke_EE')]")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> allIphone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		Thread.sleep(2000);
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(2000);
		
		for(int i=0;i<allIphone.size();i++){
			String name = allIphone.get(i).getText();
			for(int j=i;j<=i;j++)
			{
				String price =allPrice.get(j).getText();
				System.out.println(name+" : "+price);
				
			}
			
	    }
		
		driver.close();

	}

}
