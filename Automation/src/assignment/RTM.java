package assignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RTM {

		public static void main(String[] args) {
			
			WebDriver driver;
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Browser");
			int a=sc.nextInt();
			if(a==1)
			{
				driver = new ChromeDriver();
			}
			else if(a==2)
			{
				driver = new EdgeDriver();
			}
			else
			{
				System.out.println("Invalid Browser");
			}
			
			
			
			

		}


}
