package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_GetDataFromPerticularIndex 

{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		//openchrome
		
		WebDriver driver=new ChromeDriver();
		//open url
		
		driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/Table1.html");
		
		String Text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[2]")).getText();
		
		System.out.println(Text);
		
		String Text1 = driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td[3]")).getText();
        System.out.println(Text1);
        
	}

}
