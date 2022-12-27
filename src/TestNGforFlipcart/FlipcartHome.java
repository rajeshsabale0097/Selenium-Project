package TestNGforFlipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartHome 
{
	
		@FindBy(xpath = "//div[@class='go_DOp']")
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
		
//	     public void VeryfyPN(String expPN)
//		{
//			String actPN=PN.getText();
//			if(actPN.contains(expPN))
//			{
//				System.out.println("TC Passed for flipcart");
//			}
//			else
//			{
//				System.out.println("TC home Failed");
//			}
			
		}
		

	



