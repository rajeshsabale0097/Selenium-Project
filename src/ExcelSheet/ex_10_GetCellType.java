package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex_10_GetCellType
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rajesh sabale\\Downloads\\Screenshot\\Hello.xlsx");
		
		CellType s1 = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(2).getCellType();
		
		System.out.println(s1);
		
		
		
	}

}
