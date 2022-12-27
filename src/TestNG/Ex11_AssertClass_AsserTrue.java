package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex11_AssertClass_AsserTrue 
{
	@Test//(timeOut = 3000)
	public void TC1() throws InterruptedException
	{
		//Thread.sleep(2000);
		boolean actResult=true;
		Assert.assertFalse(actResult,"TC1 Failed");
		Thread.sleep(2000);

		
	}

	@Test(timeOut = 4000)
	public void TC2() throws InterruptedException
	{
		//Thread.sleep(2000);

		boolean actResult=false;
		Assert.assertFalse(actResult);
		
	}
	
	@Test(timeOut = 6000)
	public void TC3() throws InterruptedException
	{
		//Thread.sleep(8000);
		boolean actResult=false;
		Assert.assertTrue(actResult,"TC3 Failed");
		
	}
	
	@Test(timeOut = 9000)
	public void TC4() throws InterruptedException
	{
		//Thread.sleep(2000);

		boolean actResult=true;
		Assert.assertTrue(actResult);
		
	}
	
	

}
