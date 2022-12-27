package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex_6_ReadNumricDataAsAString
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream h=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Screenshot\\Hello1.xlsx");
		
		  String NuericasString = WorkbookFactory.create(h).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		  
			System.out.println(NuericasString);	
		
	}

}




                          // Doubt in this code about Read data Numeric Data As a String