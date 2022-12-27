import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_3_SelectAllCheckBoxes 

{ public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
			+ "chromedriver_win32\\chromedriver.exe");
	
	             WebDriver driver=new ChromeDriver();
	             
	             driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/multiplecheckbox.HTML");
	             
	   List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	            
	   for(WebElement s1:checkboxes)
	   {
		   s1.click();
		   Thread.sleep(100);
		   
	   }
	   //for(int i=checkboxes.size()-1;i>=0;i--)
	   for(int i=checkboxes.size()-1;i>=4;i-- )

	   {
		   checkboxes.get(i).click();
		   Thread.sleep(100);
		   
	   }
}

}
