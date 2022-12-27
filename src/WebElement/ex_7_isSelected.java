package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_7_isSelected
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\"
				+ "chromedriver_win32\\chromedriver.exe");
		//openchrome
		WebDriver driver=new ChromeDriver();
		//open url
		driver.get("https://www.facebook.com/");
		boolean button = driver.findElement(By.xpath("//a[@role='button'][2]")).isSelected();
		System.out.println(button);
		
		if(button==true)
		{
			System.out.println("button is selected");
		}
		else
		{
			System.out.println("buton is de_selected");
			
		}
	}
		

}
