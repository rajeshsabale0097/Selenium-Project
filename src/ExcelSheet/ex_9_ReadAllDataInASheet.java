package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ex_9_ReadAllDataInASheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Screensho"
				+ "t\\Hello.xlsx");
		
		
		Sheet sh1 = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastrowindex = sh1.getLastRowNum();
		
		for(int i=0;i<=lastrowindex;i++)
		{
			
			int Lastcellindex = sh1.getRow(i).getLastCellNum()-1;
			
			for(int j=0;j<=Lastcellindex;j++)
			{
				String value = sh1.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value+" ");
			}
			System.out.println();
			
		}
	}

}
