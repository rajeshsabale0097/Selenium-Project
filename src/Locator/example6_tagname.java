package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_tagname
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/Ex6_tagname.html");
		
		// enter FN
		driver.findElement(By.tagName("text")).sendKeys("abc");
		
		//enter LN
		driver.findElement(By.tagName("text")).sendKeys("xyz");

	}

}
