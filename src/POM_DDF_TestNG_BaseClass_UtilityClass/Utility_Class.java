package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class
{
	public static String getTD(int rowindex,int colindex) throws EncryptedDocumentException, IOException

	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Selenium files\\selenium sheet.xlsx");		
		 Sheet sh = WorkbookFactory.create(file).getSheet("POM WITH DDF");
		String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		
		return value;
		
	}
}
