package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex_3_SlectOptionUsingHomeKey
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		
   	             WebDriver driver=new ChromeDriver();
   	 
   	             driver.get("https://www.facebook.com/");
   	             
   	             driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
   	             
   	             Thread.sleep(2000);
   	             
   	             WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
   	             
                 Actions act=new Actions(driver);
                 
                 act.click(month).perform();
                 
                 act.sendKeys(Keys.HOME).perform();
                 
                 for(int i=1;i<=6;i++)
                 {
                	 act.sendKeys(Keys.ARROW_DOWN).perform();
       	             Thread.sleep(500);

                 }

                 act.sendKeys(Keys.ENTER).perform();
                 
                 
   	                 
		
	}

}
