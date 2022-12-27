package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("Rajesh Sabale");
		
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]")).sendKeys("Rajesh@123");
		
	}

}
