package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsdemo 
{

	
	public static String getRaddata(String path, int rowno, int colnum)
	{
		String data="";
		try 
		{
			
			FileInputStream fis= new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet1 = wb.getSheet("LTD FRS 105");
			data=sheet1.getRow(rowno).getCell(colnum).getStringCellValue();
			
		} catch (Exception e)
		{
			System.out.println("issue in getreaddata "+e);
		}
		return data;
	}
}
