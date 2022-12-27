package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex10_Keyword5_DependsOnMethods
{
	@Test
	public void TC1()
	{
	 Reporter.log("---Running TC1-------",false);
	}
	@Test(dependsOnMethods = {"TC1"})
	public void TC2()
	{
		Reporter.log("---Running TC2----",true);
	}
	
}
           //Depends on Methods wouldnt run until depend method will run 
           // it will skip