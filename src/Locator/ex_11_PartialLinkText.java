package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_11_PartialLinkText
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		//openchrome
		
		WebDriver driver=new ChromeDriver();
		//open url
		
		driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/LinkText,PartialLinkText.html");
		
	    driver.findElement(By.partialLinkText("Raj")).click();
	}
}
