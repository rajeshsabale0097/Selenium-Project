package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionFrom_SingleSelectableListBox
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		//open url
		driver.get("https://www.facebook.com/");
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select d=new Select(day);
		d.selectByVisibleText("14");
		
		Thread.sleep(2000);
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		
		//s.selectByVisibleText("Dec");
		
		//s.selectByValue("12");
		Thread.sleep(2000);
		
		s.selectByIndex(11);
		
		Thread.sleep(2000);
		
		WebElement y = driver.findElement(By.xpath("//select[@id='year']"));
		Select r = new Select(y);
		r.selectByValue("1997");
		
		
		
		
		
		
		
	}
}
