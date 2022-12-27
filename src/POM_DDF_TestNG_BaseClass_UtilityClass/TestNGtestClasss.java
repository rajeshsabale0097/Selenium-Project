package POM_DDF_TestNG_BaseClass_UtilityClass;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestNGforFlipcart.FlipcartHome;
import TestNGforFlipcart.FlipcartLogin1;

public class TestNGtestClasss extends Base_Class
{
	FlipcartLogin1 log1;
	FlipcartHome log2;
	//Sheet sh;
	//WebDriver driver;

	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{		
		 InitializeBrowser();
		 
		log1=new FlipcartLogin1(driver);
		log1=new FlipcartLogin1(driver);
		log2=new FlipcartHome(driver);
		
	}
	
	@BeforeMethod
	public void OpenApp()
	{
		System.out.println("Ran Open App");
	}
	
     @Test(priority=1)
	 public void Username() throws EncryptedDocumentException, IOException
	{  
       log1.Username(Utility_Class.getTD(0, 3));	     
	}
	@Test(priority=2)
	public void password() throws EncryptedDocumentException, IOException
	{
	    log1.password(Utility_Class.getTD(0, 1));
	}
	@Test(priority=3)
	public void loginbtn()
   {
	    log1.Loginbutton();
	}
	
	@Test(priority=4)
	public void VerifyPN() throws EncryptedDocumentException, IOException
	{
		String actPN=log2.VerifyPN();
		String expPN=Utility_Class.getTD(1,1);
		
		Assert.assertEquals(actPN, expPN,"Failed both resultes are diff");
		//This is taken from POMDDF FlipkarHome
	}
			
	@AfterMethod()
      public void closApp()
	{
	 System.out.println("Ran close App");
    }
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		//driver.quit();
	}
}
