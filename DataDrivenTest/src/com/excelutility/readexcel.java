package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {
 
	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Demo Project\\DataDrivenTest\\src\\com\\testdata\\Halfebay.xlsx");
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rownum=sheet1.getLastRowNum();
		System.out.println(rownum);
		
		for(int i=0;i<=rownum;i++) {
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("rows= "+i + " is "  +data0);
		}
		
	}
}
