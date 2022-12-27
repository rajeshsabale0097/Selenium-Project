package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_xpathByIndex1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//click on creare new acc link
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
	    Thread.sleep(3000);
		
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
	     
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
	    
	    
	    
	    
		
		
		
	}
}
