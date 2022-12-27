package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_5_Keyword_InvocationCount
{
	@Test(invocationCount=2)
	public void TC1()
	{
		Reporter.log("-----Running TC1-----",true);
	}

}
