package POM_WihDDF;

import java.sql.Driver;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2Page 
{
	@FindBy(xpath = "//input[@name='yob']")
	private WebElement YOB;
	
	public Login2Page(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public void clickonYOB(String yob)
	{
		YOB.sendKeys(yob);
		
	}
}	

