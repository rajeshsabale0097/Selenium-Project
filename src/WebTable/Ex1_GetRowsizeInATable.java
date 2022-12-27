package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_GetRowsizeInATable 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		//openchrome
		
		WebDriver driver=new ChromeDriver();
		//open url
		
		driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/Table1.html");
		
		
//        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='1234']//tr"));   
//	    //System.out.println(allRows);
//		
//	    int size = allRows.size();
//	    
//	    System.out.println(size);
	    
	    int rowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
	    
		System.out.println(rowSize);
		

		
	}

}
