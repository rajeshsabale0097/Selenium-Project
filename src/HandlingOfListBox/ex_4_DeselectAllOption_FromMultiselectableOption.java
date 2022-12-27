package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_4_DeselectAllOption_FromMultiselectableOption
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/Multiple%20select.html");
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='abcd']"));
		
		Select sel = new Select(selectCountry);
		
		sel.selectByIndex(0);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		
		Thread.sleep(2000);
		
		sel.deselectAll();
		
		

		
		
		
		
	}

}
