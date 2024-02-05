package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTimeLoginWithTheHelpOfMethod extends LaunchBrowser {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		LaunchBrowser browser = new LaunchBrowser();
		browser.setup();

		AllMethods m = new AllMethods();
		String username = m.getDataFromExcel("./src/test/resources/TestData.xlsx", "Valid", 1, 0);
		System.out.println(username);

		String password = m.getDataFromExcel("./src/test/resources/TestData.xlsx", "Valid", 1, 1);
		System.out.println(password);

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

		browser.closeBrowser();

	}

}
