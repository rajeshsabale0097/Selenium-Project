package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_10_LinkText 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		//open url
		driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/LinkText,PartialLinkText.html");

		//Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("Raj esh")).click();
		
		
}
}