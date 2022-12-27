package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_9_name
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		//open url
		driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/Ex6_tagname.html");
		// FN BY Name
		driver.findElement(By.name("Rajesh")).sendKeys("123");
		//LN By name
		driver.findElement(By.name("Bhushan")).sendKeys("234");
	}
}