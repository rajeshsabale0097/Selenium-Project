package TestNG;

	import java.sql.Driver;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	import com.beust.jcommander.Parameter;

	public class Ex17_MultibrowerTesting 
	{
		@Parameters("browserName")
			@Test
			public void OpenBrowser(String browserName) throws InterruptedException
			
		{
			WebDriver driver=null;
			if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			  driver = new FirefoxDriver();
		}
			else if(browserName.equals("Chrome"))
			{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
			}
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
//			Thread.sleep(3000);
//			driver.quit();		
			
		}

	}



