package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_3_getText 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		//open url
		driver.get("https://www.facebook.com/");
		
		String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
	    
		System.out.println(text);
		
	}
}
