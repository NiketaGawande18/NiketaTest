package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Sheet;
import jxl.Workbook;

public class Utility {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row ;
	static XSSFCell cell;
	
	 //column count
	public static int getColumnCount(String sheetName) throws Exception{
		
		FileInputStream fis=new FileInputStream("C:\\Demo Project\\Aug2020\\src\\main\\java\\com\\utility\\Userdata.xlsx");
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		int rowcount=sheet.getLastRowNum();
		System.out.println("No of row =" +rowcount);
		return rowcount;
			
	}
	 //Row count
	public static int getRowCount(String sheetName) throws Exception{
		FileInputStream fis=new FileInputStream("C:\\Demo Project\\Aug2020\\src\\main\\java\\com\\utility\\Userdata.xlsx");
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		int colcount=row.getLastCellNum();
		System.out.println("No of column " +colcount);
		return colcount;
		}
		
	
	
	
	public static ArrayList<String> getDataFromExcel1(String fileName, String sheetName, int rowCount, int columncount) throws Exception {
		
		FileInputStream fis = new FileInputStream(fileName);
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sh = workbook.getSheet(sheetName);
		int rows = sh.getRows();
		System.out.println(rows);
		int cols = sh.getColumns();
		System.out.println(cols);
		String txt=null;
		
		ArrayList<String> expected= new ArrayList<String>();
		for (int j = 0; j <columncount; j++) {
			
			for (int i = 0; i <rowCount; i++) {
			
			 txt=sh.getCell(j, i).getContents();
			System.out.print("       "+txt);				
			}
		System.out.println("");
		}
		expected.add(txt);
		System.out.println(expected);
		return expected;

	}

public static ArrayList<String> readAnyRowData (String fileName, String sheetName,int rowNo) throws Exception {
	ArrayList<String>  expListRow = new ArrayList<String>();
	FileInputStream fis = new FileInputStream(fileName);
	Workbook workbook = Workbook.getWorkbook(fis);
	Sheet sh = workbook.getSheet(sheetName);
	
	int cols = sh.getColumns();
	System.out.println(cols);
		for(int i=0; i<cols; i++) {
			expListRow.add(sh.getCell(i,rowNo).getContents());
		}
		System.out.println(expListRow);
		System.out.println(expListRow.size());

	
	return expListRow;
}
	
}
	


