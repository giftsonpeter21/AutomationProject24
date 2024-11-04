package Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	public static String getCellvalue (String xl,String sheet,int r,int c)
	{
		try
		{
			FileInputStream file = new FileInputStream(xl);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFCell Cell = wb.getSheet(sheet).getRow(r).getCell(c);
			
			if(Cell.getCellType()==CellType.STRING)
			{
				return Cell.getStringCellValue();
			}
			else
			{
				return Cell.getRawValue();
			}
		}
		catch(Exception e)
		{
			return "";
		}
	}
	
	public static int getRowvalue (String xl, String sheet)
	{
		try
		{
			FileInputStream file = new FileInputStream(xl);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			return wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			return 0;
		}
	}

}
