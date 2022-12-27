package POM_DDF_TestNG;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1Page 
{
	@FindBy(xpath = "//input[@name='userId']")
	private WebElement UN;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement PWD;
	
	@FindBy(xpath = "//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']")
	private WebElement clicks;
	
   public Login1Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
	
   public void Login1PageUN(String username) 
   {
	 UN.sendKeys(username);	 
   }
   
   public void enterPASS(String pass) 
   {
	 PWD.sendKeys(pass);	 
   }
   
   public void lgnclick() 
   {
	 clicks.click();
   }
      
   
}