package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex_3_GetRowsizeInAsheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Screenshot\\Hello.xlsx");
		
		int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
		
		System.out.println(rowsize);
		
	}

}
