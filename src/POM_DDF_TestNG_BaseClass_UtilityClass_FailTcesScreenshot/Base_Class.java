package POM_DDF_TestNG_BaseClass_UtilityClass_FailTcesScreenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
	WebDriver driver;
	public void InitializeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32 v108\\chromedriver.exe");		
		driver=new ChromeDriver(); 

		driver.get(Utility_Class.getPFData("URL"));	
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
