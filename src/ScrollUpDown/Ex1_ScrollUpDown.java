package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_ScrollUpDown
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

		 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,4000)");
		 
		 Thread.sleep(3000);
		 
		 //UP--> 2nd parameter -ve value
		 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-2000)");
		 
		 
		 //Left Scroll--> 1st pameter -ve value		 
		 ((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");
		 
		 //Right --> 1st parameter +value		 
		 ((JavascriptExecutor)driver).executeScript("window.scrollBy(200)");
		 
		 
		 
		
	}

}
