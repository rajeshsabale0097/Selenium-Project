package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import WebDriver.WebDriver;

public class ex_1 
{

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		ChromeDriver driver=new ChromeDriver();   //upcasting
		
		
		
	   driver.get("https://www.google.com/");
		
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //downcasting
	   
	   System.out.println(src);
	   
	   File dest=new File("C:\\Users\\Rajesh sabale\\Downloads\\Screenshot\\abc.jpg");
	   
	   org.openqa.selenium.io.FileHandler.copy(src, dest);
	   	
	}

}
