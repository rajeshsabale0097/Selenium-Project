package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex14_RunFailedTCsEx2 
{
	@Test
	public void TC5()
	{
		Reporter.log("---Runnung TC5----",true);
	}
	@Test
	public void TC6()
	{
		Reporter.log("-----Runing TC6-----",true);
	}
	@Test
	public void TC7()
	{
		Reporter.log("----Runnning TC7----",true);
	}
	@Test
	public void TC8()
	{
		Reporter.log("----Running TC8-----",true)
	}
	

}
