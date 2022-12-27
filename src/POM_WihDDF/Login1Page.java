package POM_WihDDF;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1Page 
{
	@FindBy(xpath = "//input[@type='text']")	
	private WebElement mobNo;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement clickbtn;
	
	@FindBy(xpath = "//input[@class='_3704LK']")
	private WebElement PWD;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement clicks;
	
   public Login1Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public void enterMobNO(String mobno) 
   {
	   mobNo.sendKeys(mobno);	 
  }
	
   public void clickonclosebtn()
   {
	 	 clickbtn.click();
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