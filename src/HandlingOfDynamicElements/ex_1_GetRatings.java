package HandlingOfDynamicElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_1_GetRatings
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");		
WebDriver driver=new ChromeDriver(); 
                Thread.sleep(3000);

   	            driver.get("https://www.flipkart.com/");
   	            
                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

   	            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
   	              	            
   	            driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Redmi note 10");

   	            driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

   	         String Hello = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();

   	               	             
   	             System.out.println(Hello);

	}

}
