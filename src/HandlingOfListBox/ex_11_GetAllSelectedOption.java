package HandlingOfListBox;

import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_11_GetAllSelectedOption 
{
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/Multiple%20select.html");
		
		Thread.sleep(2000);
		
		WebElement alloption = driver.findElement(By.xpath("//select[@id='abcd']"));
		
		Select s2=new Select(alloption);
		
		s2.selectByIndex(0);
		s2.selectByIndex(3);
		s2.selectByIndex(2);
		
		List<WebElement> multipleOption = s2.getOptions();
		
		for(WebElement s3:multipleOption);
				
		{
		//	System.out.println(s3.get);
			
			// This ex is failed becoz this ex of html
		}
	}

}
