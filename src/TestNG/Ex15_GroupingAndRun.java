package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex15_GroupingAndRun
{
	@Test(groups = "A")
	public void TC1()
	{
		Reporter.log("----Running TC1----",true);
	}
	@Test(groups = "A")
	public void TC2()
	{
		Reporter.log("----Running TC2----",true);
	}
	@Test(groups = "B")
	public void TC3()
	{
		Reporter.log("----Running TC3----",true);
	}
	@Test(groups = "C")
	public void TC4()
	{
		Reporter.log("----Running TC4----",true);
	}
	

}
