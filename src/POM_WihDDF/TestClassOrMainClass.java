package POM_WihDDF;

import java.awt.Window;
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
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\selenium sheet.xlsx");		
		Sheet sh = WorkbookFactory.create(file).getSheet("POM WITH DDF");
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://login.upstox.com/");
		
		
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
        Thread.sleep(3000);
        
		Login1Page login1 = new Login1Page(driver);
		login1.enterMobNO(sh.getRow(0).getCell(3).getStringCellValue());
		login1.clickonclosebtn();
		login1.enterPASS(sh.getRow(0).getCell(1).getStringCellValue());
		login1.lgnclick();
		
		Login2Page login2= new Login2Page(driver);
		login2.clickonYOB(sh.getRow(0).getCell(2).getStringCellValue());
		
		driver.manage().window().maximize();
	    HomePage login3=new HomePage(driver);
	    login3.VeryfyPN(sh.getRow(0).getCell(2).getStringCellValue());
		
		
		
		
		
		
	}

}
