package Pom_WithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_Login2Page
{
	@FindBy(xpath = "//input[@name='yob']")	
	private WebElement YOB;
	
	public Upstox_Login2Page(WebDriver driver)
	{
		PageFactory.initElements( driver,this);		
	}
	public void enteryob() 
	{
		YOB.sendKeys("1998");
	}
	
}
