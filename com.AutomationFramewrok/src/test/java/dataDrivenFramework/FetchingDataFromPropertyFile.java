package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Create The object of fileInputStream class
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
		
		//create the object of properties file
		Properties prop = new Properties();
		 
		//load all the script in your test script
		prop.load(fis);
		
		//provide the key and fretch the value
		String browser = prop.getProperty("Browser");
		
		System.out.println(browser);
		

	}

}
