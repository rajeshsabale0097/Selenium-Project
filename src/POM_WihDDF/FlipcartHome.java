package POM_WihDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartHome 
{
	
		@FindBy(xpath = "(//div[@class='xtXmba'])[8]")
		private WebElement PN;
		
		
		public FlipcartHome(WebDriver driver)
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
				System.out.println("TC Passed for flipcart");
			}
			else
			{
				System.out.println("TC Failed");
			}
			
		}
		

	}



