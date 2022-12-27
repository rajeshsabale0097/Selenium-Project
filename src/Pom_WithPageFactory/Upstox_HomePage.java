package Pom_WithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_HomePage
{
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")
	private WebElement PN;
	
	public Upstox_HomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public void verifyuserid()
	{
	  String actPN = PN.getText();
	   String expPN = "Ruturaj P.";
	   
//	  if(actPN.equals(expPN))
//	  {
//		  System.out.println("Pass");
//	  }
//	  else
//	  {
//		 System.out.println("Failed"); 
//	  }
//		
//	}

}
