package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_5_IsMultiple_FromMultiSelectable
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        
		Select s = new Select(month);
		
		boolean result = s.isMultiple();
		
		System.out.println(result);
		if(result==true)
		{
			System.out.println("Multiple");
		}
		else
		{
			System.out.println("Not Multiple");
			
		}
		
		
	
		
	}

}
