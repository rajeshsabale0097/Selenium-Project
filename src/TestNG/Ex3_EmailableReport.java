package TestNG;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex3_EmailableReport

{
     @Test
	public void TC1() 
	{
		System.out.println("Running Test Case 2");
	}
     @Test
     public void TC2()
 	{
 		Reporter.log("Running Test Case 4",false);
 	}
     @Test
     public void TC4() 
 	{
 		Reporter.log("Running Test Case 3",true);
 	}// Reporter.log-->emailable report	                       // true -->massage in console
      		
}
