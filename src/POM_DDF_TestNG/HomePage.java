package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")
	private WebElement PN;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
//	public String VerifyUserID()
//	{
//		String text=PN.getText();
//		return text;
//	}
	
        public void Veryfy(String expPN)
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
