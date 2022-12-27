package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;


public class ex_6_IsMultipleExOnhtmlMultipleCountry
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/Multiple%20select.html");
		
		WebElement Selectcountry = driver.findElement(By.xpath("//select[@id='abcd']"));
		
		Select s=new Select(Selectcountry);
		
		boolean nikal = s.isMultiple();
		
		System.out.println(nikal);
		if(nikal==true)
		{
			System.out.println("Select Country Option is MultiSelectable");
		}
		else 
		{
			System.out.println("Select Country Option is SingleSelectable");
			
		}
		
		
		
       
	}

}
