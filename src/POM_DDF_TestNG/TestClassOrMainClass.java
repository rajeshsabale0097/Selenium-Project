package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassOrMainClass 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\selenium sheet.xlsx");		
		Sheet sh = WorkbookFactory.create(file).getSheet("POM WITH DDF");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://login-v2.upstox.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Login1Page login1 = new Login1Page(driver);
		login1.Login1PageUN(sh.getRow(0).getCell(0).getStringCellValue());
		login1.enterPASS(sh.getRow(0).getCell(4).getStringCellValue());
		login1.lgnclick();
		
		Login2Page login2= new Login2Page(driver);
		login2.clickonYOB(sh.getRow(0).getCell(2).getStringCellValue());
		
		HomePage login3 = new HomePage(driver);
		login3.Veryfy(sh.getRow(0).getCell(3).getStringCellValue());	
		
		
		
		
		
	}

}
