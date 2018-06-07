package com.jenkins.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	String path;
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	public ExcelReader(String path)
	{
		this.path=path;
		 try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
		}
		 
		 catch (Exception e) {
			
			e.printStackTrace();
		}
		 
		
	}
	
	public String getCellData(String sheetName,String ColName,int rowNum)
	{
		int col_num = 0;
		int index=workbook.getSheetIndex(sheetName);
		
		sheet = workbook.getSheetAt(index);
		
		XSSFRow row = sheet.getRow(0);	
		
		for(int i=0;i<=row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().equals(ColName))
			{
				col_num = i;
			}
		}
	   
	   row=sheet.getRow(rowNum-1);
	   
	  cell=row.getCell(col_num);
	 return cell.getStringCellValue();
	}
	
	
}
