package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_get 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Se"
			+ "lenium files\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
		
	}

}
