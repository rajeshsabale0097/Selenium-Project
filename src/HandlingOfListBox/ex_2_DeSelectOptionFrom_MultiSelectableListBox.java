package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_2_DeSelectOptionFrom_MultiSelectableListBox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/Multiple%20select.html");
		
		//step1
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='abcd']"));
		
		//step2
		 Select s = new Select(SelectCountry);
		 
		 //step3
		 
		 //s.selectByVisibleText("IND");
		 //s.selectByVisibleText("INDO");
		 
		s.selectByIndex(0);
		s.selectByIndex(2);
		
		//s.selectByValue("1");
		//s.selectByValue("3");


		
		
		
		

		 
		
		
		
	}

}
