package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class ExcelUtils {
	public static String[] toReadExcelData1(String sTestCaseID) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		String sData[]=null;
		try
		{
			FileInputStream fis = new FileInputStream(new File("D:\\Test data_FA.xlsx"));
			Workbook wb =  WorkbookFactory.create(fis);
		
			org.apache.poi.ss.usermodel.Sheet sht = wb.getSheet("testdata");
			int iRowNum= ((org.apache.poi.ss.usermodel.Sheet) sht).getLastRowNum();
			
			for(int i=1; i<=iRowNum; i++)
			{
				if(((org.apache.poi.ss.usermodel.Sheet) sht).getRow(i).getCell(0).toString().equals(sTestCaseID))
				{
					int iCellNum=((org.apache.poi.ss.usermodel.Sheet) sht).getRow(i).getLastCellNum();
					sData= new String[iCellNum];
					
					for(int j=0; j<iCellNum; j++)
					{
						sData[j]=((org.apache.poi.ss.usermodel.Sheet) sht).getRow(i).getCell(j).getStringCellValue();
					}
					
					break;
				}
			}
		
	
		}
		
	catch(EncryptedDocumentException ex){
		ex.printStackTrace();
	}
	catch(InvalidFormatException ex){
		ex.printStackTrace();
	}
	catch(IOException ex){
		ex.printStackTrace();
	}
		return sData;
		
     }

//	public static String[] toReadExcelData(String sTestCaseID) {
//		// TODO Auto-generated method stub
//		return null;
	

	}





