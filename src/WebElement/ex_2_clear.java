package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_2_clear 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		//open url
		driver.get("https://www.facebook.com/");
       
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@id='email']")).clear();
		
		//.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");
		
	     WebElement	UN=driver.findElement(By.xpath("//input[@id='email']"));

	     UN.sendKeys("abc");
	     Thread.sleep(2000);
	     UN.clear();
	     Thread.sleep(2000);
	     UN.sendKeys("xyz");
	     
	
	}
}
