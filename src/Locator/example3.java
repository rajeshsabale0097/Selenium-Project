package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import WebDriver.WebDriver;

public class example3
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		
          ChromeDriver driver = new ChromeDriver();
          
		
		driver.get("https://www.facebook.com/");
		
		//click on forgotten pwd link
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

}
