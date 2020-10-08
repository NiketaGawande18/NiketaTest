package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelconfig {

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public Excelconfig(String path) {
		File src=new File(path);
		try {
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
				
		}
	public String getdata(int sheetNumber,int row,int col) {
		
		sheet1=wb.getSheetAt(sheetNumber);
		String data = sheet1.getRow(row).getCell(col).getStringCellValue();
		return data ;
		
		
	}
	
	/*public int getrowcount(int sheetIndex) {
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
		
	} */
}
