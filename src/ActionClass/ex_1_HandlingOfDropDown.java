package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex_1_HandlingOfDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		
   	             WebDriver driver=new ChromeDriver();
   	 
   	            driver.get("https://www.flipkart.com/");
   	               	                            
   	            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
   	            
                Thread.sleep(2000);
   	           WebElement LgnBtn = driver.findElement(By.xpath("//a[@class='_1_3w1N']")); 	            
                Actions act=new Actions(driver);
                act.moveToElement(LgnBtn).perform();
                Thread.sleep(2000);
                
                 
                driver.findElement(By.xpath("(//div[@class='_3vhnxf'])[6]")).click();
	}

}
