package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex9_Keyword4_TimeOut 
{
	@Test(timeOut = 5000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(3000);
		Reporter.log("----rinning TC1----",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("----rinning TC2----",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("----rinning TC3----",true);
	}
	@Test
	public void TC4()
	{
		Reporter.log("----rinning TC4----",true);
	}
	
	

}
