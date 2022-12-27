package HandlingOfListBox;

import java.sql.Driver;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_3_SelectOptionFrom_MultiSelectableListBox
{

	public static void main(String[] args) throws InterruptedException 
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
			+ "chromedriver_win32\\chromedriver.exe");
	//openchrome
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/Multiple%20select.html");
	
	WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='abcd']"));
	
	Select s = new Select(SelectCountry);
    
    //s.selectByValue("1");
    // s.selectByValue("4");

     // s.selectByIndex(0);
     // s.selectByIndex(3);

    
    s.selectByVisibleText("IND");
     s.selectByVisibleText("AUST");

     Thread.sleep(1000);
     
     s.deselectByIndex(0);
     s.deselectByIndex(3);

     
     
     
    
    
	}
	

}
