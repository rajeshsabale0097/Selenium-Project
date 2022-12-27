package POM_WihDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6']")
	private WebElement PN;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String VerifyPN()
	{
		String text=PN.getText();
		return text;
	}
	
	public void VeryfyPN(String expPN)
	{
		String actPN=PN.getText();
		if(actPN.contains(expPN))
		{
			System.out.println("TC Passed");
		}
		else
		{
			System.out.println("TC Failed");
		}
		
	}
	

}
