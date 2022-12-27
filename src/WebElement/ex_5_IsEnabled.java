package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_5_IsEnabled 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		//open url
		driver.get("https://www.facebook.com/");
		
		boolean login = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		System.out.println(login);
		
		if(login==true)
		{
			System.out.println("Element id enabled");
		}
		else
		{
			System.out.println("Element id disabled");
		}
	}
	
}
