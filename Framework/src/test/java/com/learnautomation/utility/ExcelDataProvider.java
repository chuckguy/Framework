package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		File src = new File("./TestData/Data.xlsx");
		

		try {
			//Convert to raw data
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			
			System.out.println("Unable to read Excel file "+e.getMessage());
		}
	}
	
	public String getStringData(int SheetIndex,int row,int column)
	{
		return wb.getSheetAt(SheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(String SheetName,int row,int column)
	{
		return wb.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String SheetName,int row,int column)
	{
		return wb.getSheet(SheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
