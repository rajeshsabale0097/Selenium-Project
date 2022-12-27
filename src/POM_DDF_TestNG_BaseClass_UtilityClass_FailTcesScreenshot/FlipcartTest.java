package POM_DDF_TestNG_BaseClass_UtilityClass_FailTcesScreenshot;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartTest
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\selenium sheet.xlsx");		
		Sheet sh = WorkbookFactory.create(file).getSheet("POM WITH DDF");
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 
		
        driver.get("https://www.flipkart.com/");
        
        FlipcartLogin1 log1=new FlipcartLogin1(driver);
        log1.Username(sh.getRow(0).getCell(0).getStringCellValue());
        log1.password(sh.getRow(0).getCell(0).getStringCellValue());
        
        FlipcartHome log2=new FlipcartHome(driver);
        log2.VerifyPN(sh.getRow(0).getCell(4).getStringCellValue());
        
        
}
}