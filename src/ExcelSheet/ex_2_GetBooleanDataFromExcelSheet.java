package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex_2_GetBooleanDataFromExcelSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Screenshot\\Hello.xlsx");
		
		boolean h = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
		
		System.out.println(h);
		
		
	}

}
