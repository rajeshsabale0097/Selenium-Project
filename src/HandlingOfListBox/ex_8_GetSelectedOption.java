package HandlingOfListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ex_8_GetSelectedOption 
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
		
		month.sendKeys("Dec");
	
		Select s=new Select(month);
		
        String TEXT = s.getFirstSelectedOption().getText();
       System.out.println(TEXT);
		
	//	List<WebElement> MultipleOption = s.getOptions();
	//	for(WebElement s1: MultipleOption)
	//	{
	//		System.out.println(s1.getText());                This is ex.of GetAllOptionFromListBox
	//	}
	//	
		
	}

}
