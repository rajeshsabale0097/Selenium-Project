package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_Scroll_Into_View 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 

		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		 Thread.sleep(3000);

         // scroll Down 2nd parameter +value
		 Thread.sleep(3000);
		 
		 WebElement Facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));

		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",Facebook);
	}

}
