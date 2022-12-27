package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_NormalTestClass 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");		
	WebDriver driver=new ChromeDriver(); 

	 driver.get("https://www.facebook.com/");
	 
	 Thread.sleep(3000);
	 
	 driver.close();
	 
	 
	 

}
}