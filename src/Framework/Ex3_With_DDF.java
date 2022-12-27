package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_With_DDF 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Screenshot\\Hello.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 

		 driver.get("https://www.saucedemo.com/");
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		// String username = sh.getRow(0).getCell(0).getStringCellValue();
		 driver.findElement(By.xpath("//input[@class='input_error form_input']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		// String Password = sh.getRow(0).getCell(1).getStringCellValue();
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		 
		 
		 //login
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 boolean logo = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
		 if(logo==true)
		 {
			 System.out.println("Logo found --> TC Passed");
		 }
		 else
		 {
			 System.out.println("Logo not found");
		 }
		 //burger btn
		 driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		 
		 //Logout
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		 Thread.sleep(3000);
		 
		  driver.close();
		 

		
	}

}
