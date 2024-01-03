package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDependantIndependant {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop" ,Keys.ENTER);
		Thread.sleep(2000);
		WebElement laptopPrice = driver.findElement(By.xpath("//span[text()='ASUS [SmartChoice] Vivobook 15, Intel Celeron N4020, 15.6\" (39.62 cms) HD, Thin and Light Laptop (8GB/512GB SSD/Integrated Graphics/Windows 11/Office 2021/Fingerprint/Silver/1.8 kg), X515MA-BR024WS']/ancestor::h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/descendant::span[text()='26,990']"));
		Thread.sleep(2000);
		System.out.println(laptopPrice.getText());
		driver.quit();
		

	}

}
