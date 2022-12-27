package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_15_GroupingAndRun 
{
	@Test(groups = "E")
	public void TC5()
	{
		Reporter.log("----Running TC5----",true);
	}
	@Test(groups = "F")
	public void TC6()
	{
		Reporter.log("----Running TC6----",true);
	}
	@Test(groups = "F")
	public void TC7()
	{
		Reporter.log("----Running TC7----",true);
	}
	@Test(groups = "A")
	public void TC8()
	{
		Reporter.log("----Running TC8----",true);
	}
	

}
