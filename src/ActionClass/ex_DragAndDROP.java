package ActionClass;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex_DragAndDROP
{
     public static void main(String[] args) throws InterruptedException 
     {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
 				+ "chromedriver_win32\\chromedriver.exe");
 		
    	 WebDriver driver=new ChromeDriver();
    	 
    	 driver.get("https://demo.guru99.com/test/drag_drop.html");
    	 
    	 driver.manage().window().maximize();
    	 
    	WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
    	
    	Thread.sleep(2000);
    	
    	 
    	WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
    	 
    	 Actions act=new Actions(driver);
    	 
    	// act.dragAndDrop(src,dest ).perform();
    	// act.dragAndDrop(src,dest ).perform();
    	 act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
    	 

    	 
    	 
    	 
    	 
    	 
		
	}

}
