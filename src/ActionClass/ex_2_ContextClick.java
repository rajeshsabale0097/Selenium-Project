package ActionClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex_2_ContextClick
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		
   	             WebDriver driver=new ChromeDriver();
   	 
   	            driver.get("https://www.flipkart.com/");
   	            
   	            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
   	            
   	            Thread.sleep(2000);
   	            
 	            Actions act=new Actions(driver);

   	           WebElement LgnBtn = driver.findElement(By.xpath("(//a[@class='_1_3w1N'])"));

   	      // act.moveToElement(LgnBtn).perform();
   	        // act.contextClick().perform();
   	         
   	         //act.moveToElement(LgnBtn).contextClick().perform();
   	         
   	         act.contextClick(LgnBtn).perform();
   	         	
	}

}
