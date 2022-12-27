package Pom_WithPageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upstox_TestClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 

		 driver.get("https://login-v2.upstox.com/");
		 
		 driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS);
		 
		Upstox_Login1Page Login1 = new Upstox_Login1Page(driver);
		Login1.EnterUN();
		Login1.enterPWD();
		Login1.clickonloginbutton();
		
		Upstox_Login2Page Login2 = new Upstox_Login2Page(driver);
		Login2.enteryob();
		
		Upstox_WelcomePage welcome = new Upstox_WelcomePage(driver);
		welcome.clickonnoamgood();
		
		Upstox_HomePage Homepage = new Upstox_HomePage(driver);
		
		Homepage.verifyuserid();
		
		Thread.sleep(2000);
		
		//driver.close();			
	}

}
