package Pom_WithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_Login1Page 
{
	//step1: variable declaration 
	@FindBy(xpath = "//input[@name='userId']")
	private WebElement UN;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement PWD;
	
	@FindBy(xpath = "//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']")
	private WebElement lgnbtn;
	
	//Variable Initialization 
	public Upstox_Login1Page (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void EnterUN()
	{
	    UN.sendKeys("HF6115");
	}
	public void enterPWD()
	{
		PWD.sendKeys("Patil@3333");
	}
	public void clickonloginbutton()
	{
		lgnbtn.click();
	}
	

}
