package POM_WihDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartLogin1
{
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement clickclose;
	
	
	@FindBy(xpath = "//input[@class='_3704LK']")
	private WebElement search;
	
	public FlipcartLogin1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	public void clickonclose()
	{
		clickclose.click();
	}
	
	public void searchmob(String mobname)
	{
		search.sendKeys(mobname);
	}
	
	
	
}
