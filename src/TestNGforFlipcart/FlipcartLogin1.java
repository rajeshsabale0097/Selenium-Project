package TestNGforFlipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartLogin1
{
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement UN;
	
	
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement Pass;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement Loginbtn;
	
	public FlipcartLogin1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	public void Username(String UNss)
	{
	    UN.sendKeys(UNss);
	}
	
	public void password(String pass)
	{
		Pass.sendKeys(pass);
	}
	public void Loginbutton()
	{
		Loginbtn.click();
	}
	
	
	
}
