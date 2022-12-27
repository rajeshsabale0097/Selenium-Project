package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex_8_ReadAllDataInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Screenshot\\Hello.xlsx");
		
		Sheet sh2 = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastcellindex = sh2.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=lastcellindex;i++)
		
		{
			String value = sh2.getRow(0).getCell(i).getStringCellValue();
			
		
		System.out.print(value+"  ");
		
		}
	}

}
