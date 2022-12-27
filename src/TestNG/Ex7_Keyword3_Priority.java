package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex7_Keyword3_Priority
{
	@Test(priority=1)
	public void TC1()
	{
		Reporter.log("----Running TC1--------",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("----Running TC2--------",true);
	}
	@Test(priority=2)
	public void TC3()
	{
		Reporter.log("----Running TC3--------",true);
	}
	@Test
	public void TC4()
	{
		Reporter.log("----Running TC4--------",true);
	}


}           //  0=it will be in priority 1st then 1 ,2,3
     