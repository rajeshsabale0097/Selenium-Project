package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_WithOut_DDF 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 

		 driver.get("https://www.saucedemo.com/");
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 //enter UN
		 driver.findElement(By.xpath("//input[@class='input_error form_input']")).sendKeys("standard_user");
		 
		 //enter password
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		 
		 //click on login btn
		 driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		 
		 
		 boolean result = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
		 
		 if (result==true)
		 {
			System.out.println("Logo Found --> TC Passes");
		 } 
		 
		 else
		 {
           System.out.println("Logo Not Found --> TC Failed");
		 }
		 
         Thread.sleep(10000);

		 driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		 
		 driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.close();		 		
	}

}
