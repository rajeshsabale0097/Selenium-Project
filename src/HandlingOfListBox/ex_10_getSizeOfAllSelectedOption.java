package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_10_getSizeOfAllSelectedOption
{

		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
					+ "chromedriver_win32\\chromedriver.exe");
			//openchrome
			WebDriver driver=new ChromeDriver();
			
			driver.get("file:///C:/Users/Rajesh%20sabale/Downloads/Selenium%20files/Multiple%20select.html");
			
			WebElement how = driver.findElement(By.xpath("//select[@id='abcd']"));
			
             
			Select s1=new Select(how);
			
			s1.selectByIndex(0);
			s1.selectByVisibleText("PAK");
			s1.selectByIndex(3);
			
			int size = s1.getAllSelectedOptions().size();
			System.out.println(size);
             
             
		
	} 
	

}
