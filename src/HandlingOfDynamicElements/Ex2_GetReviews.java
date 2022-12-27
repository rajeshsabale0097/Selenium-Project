package HandlingOfDynamicElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_GetReviews 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 

		 driver.get("https://www.flipkart.com/");
		   	 
		 driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		 
		 
		 //click on close button
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		 //enter mob no.
		 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Redmi Note 10");
		 
		 Thread.sleep(3000);
		 
        // driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();		
		 //Thread.sleep(3000);

		 //String reviews =driver.findElement(By.xpath("(//div[@class='_2kHMtA'][1]//span)[8]")).getText();
		 
		// System.out.println(reviews);
		 
		 

		 
	
		
	}

}
