package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example10
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium file"
				+ "s\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(2000);

		
		driver.navigate().back();
		
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);


		driver.navigate().refresh();


	}
		
		

}
