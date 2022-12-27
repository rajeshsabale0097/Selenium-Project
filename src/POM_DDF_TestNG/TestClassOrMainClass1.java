package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClassOrMainClass1
{
	Login1Page login1;
	Login2Page login2;
	HomePage Home;
	Sheet sh;
	WebDriver driver;

	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{

	FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\selenium sheet.xlsx");		
	Sheet sh = WorkbookFactory.create(file).getSheet("POM WITH DDF");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");		
	driver=new ChromeDriver(); 
	
	driver.get("https://login-v2.upstox.com/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	login1=new Login1Page(driver);
	login2=new Login2Page(driver);
	Home=new HomePage(driver);

     }

   @BeforeMethod
   public void OpenToApp()
   {
	   login1.Login1PageUN(sh.getRow(0).getCell(0).getStringCellValue());
	   login1.enterPASS(sh.getRow(0).getCell(1).getStringCellValue());
	   login1.lgnclick();
	   login2.clickonYOB(sh.getRow(0).getCell(2).getStringCellValue());
	
   }
   @Test
   public void UserID()
   {
	   String actPN = Home.VerifyUserID();
	   String expPN=sh.getRow(0).getCell(0).getStringCellValue();
	   
	   org.testng.Assert.assertEquals(actPN,expPN,"Failed,Both results are diff");
	   
   }
   @AfterMethod
   public void LogoutFromApp()
   {
	   
	   
   }
   @AfterClass
   public void CloseBrowser()
   {
	   driver.quit();
	   
   }
   }
   
   
