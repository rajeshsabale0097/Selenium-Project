package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_xPathByAtribute 
{
	public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\c"
			+ "hromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	//driver.findElement("Locator")
	//driver.findElement(By.xpath("String xPathExpression"))
	
	//enter UN
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9766920578");
	
	//enter password
	
	driver.findElement(By.xpath("// input[@name='pass']")).sendKeys("Rs@123456");
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	
	
	
	
}
}
