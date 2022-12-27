package POM_DDF_TestNG_BaseClass_UtilityClass_FailTcesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.sql.Driver;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class
{
	public static String getTD(int rowindex,int colindex) throws EncryptedDocumentException, IOException

	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\selenium sheet.xlsx");		
		 Sheet sh = WorkbookFactory.create(file).getSheet("POM WITH DDF");
		String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		
		return value;
		
	}
	public static void CaptureScreenshot(WebDriver driver,int TCID) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Rajesh sabale\\eclipse-workspace\\SELENIUM PROJECT\\ScreenShot\\TCid"+TCID+".jpg");
        
        FileHandler.copy(src, dest);
		
	}
	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\eclipse-workspace\\SELENIUM PROJECT\\PropertyFile.properties");
		
		Properties p=new Properties();
		
		p.load(file);
		String value = p.getProperty(key);
		return value;
		
	}
}
