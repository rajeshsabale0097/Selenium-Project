package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Ex11_AssertClass1_asserequals 
{
	@Test
     public void TC1()
     {
		String actResult="HI";
		String expResult="Hello";
		
		org.testng.Assert.assertEquals(actResult, expResult,"TC1 Failed");
		
     }
	
	@Test
    public void TC2()
    {
		String actResult="HI";
		String expResult="HI";
		
		org.testng.Assert.assertEquals(actResult,expResult);
		

}
}
