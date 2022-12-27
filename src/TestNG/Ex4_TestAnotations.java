package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex4_TestAnotations 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("-----Open Browser------",true);
	}
	@BeforeMethod
	private void LoginToApp()
	{
      Reporter.log("------Login to App----",true);
	}
	@Test
	public void VerifyUserID1()
	{
		Reporter.log("---Verify UserID1---",true);
		
	}
	@Test
	public void VerifyUserID2() 
	{
		Reporter.log("---VerifyUserID2----",true);		
	}
	@AfterMethod
	public void LogouttoApp()
	{
		Reporter.log("---Logout to App-----",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("---close browser",true);
	}
	

}
