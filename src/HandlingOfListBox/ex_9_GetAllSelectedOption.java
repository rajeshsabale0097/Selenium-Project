package HandlingOfListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_9_GetAllSelectedOption 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/Multiple%20select.html");
		
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='abcd']"));
		
		Select s2=new Select(selectcountry);
		
		s2.selectByIndex(0);
		s2.selectByVisibleText("AUST");
		s2.selectByIndex(2);
		
		List<WebElement> alloption = s2.getAllSelectedOptions();
		for(WebElement s1:alloption)
		{
			System.out.println(s1.getText());
		}
		
		
		
		
	}

}
