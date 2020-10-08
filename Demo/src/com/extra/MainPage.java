package com.extra;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainPage {

	
	public static void getexceldata() throws Exception {
		FileInputStream fis=new FileInputStream("D:\\Demo Project\\Demo\\MenuBar.xlsx");
		XSSFWorkbook wd= new XSSFWorkbook(fis);
		XSSFSheet sheet=wd.getSheetAt(0);
		int countrow=sheet.getLastRowNum();
		System.out.println("Total row = " +countrow);
		for(int i=0;i<countrow;i++) {
			String data0=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data0);
		}
		
		
					
	}

	
	}

