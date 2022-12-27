package TestNG;

import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Ex11_AssertClass1_asserNotquals 
{
	public class Ex11_AssertClass_AsserTrue {

	}
	@Test
	public void TC3()
	{
		String actResult="Hi";
		String expResult="Hello";
		
		org.testng.Assert.assertNotEquals(actResult, expResult);
		
	}
	@Test
       public void TC4()
	{
	    String actResult="Hi";
		String expResult="Hi";
		
		Assert.assertNotEquals(expResult, expResult,"TC3 Failed");


}
}
