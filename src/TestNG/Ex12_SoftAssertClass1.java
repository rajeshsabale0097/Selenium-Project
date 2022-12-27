package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ex12_SoftAssertClass1 
{
	@Test
	public void TC10()
{
	SoftAssert soft = new SoftAssert();

	boolean actResult1=false;
	soft.assertTrue(actResult1,"Failed");
}
	@Test
	public void TC11()
	{
	String actResult="HI";
	String expResult="HI";
	
	SoftAssert soft = new SoftAssert();

	soft.assertEquals(actResult,expResult,"Failed");	
	
	
	
	soft.assertAll();
}	
	

}
