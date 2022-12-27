package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_GetColumnSizeInARow 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		//openchrome
		
		WebDriver driver=new ChromeDriver();
		//open url
		
		driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/Table1.html");
		
		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
		System.out.println(colSize);
		
	   //For Header
		int colSize1 = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
         System.out.println(colSize1);
	}

}
