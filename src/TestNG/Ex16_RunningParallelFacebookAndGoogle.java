package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex16_RunningParallelFacebookAndGoogle 
{
	@Test
	public void OpenFacebook() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 

		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(3000);
		 
		 driver.close();
	}

}
