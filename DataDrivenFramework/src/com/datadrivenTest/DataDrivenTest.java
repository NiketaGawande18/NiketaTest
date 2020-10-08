package com.datadrivenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		
        Xls_Reader reader=new Xls_Reader("D:\\Demo Project\\DataDrivenFramework\\src\\com\\testData\\ContactDetails.xlsx");
		
		String firstname=reader.getCellData("sheet1", "Name", 2);
		System.out.println(firstname);
		
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ameet/OneDrive/Desktop/JBK%20Offline/java-classes-contact-pune.html");
		driver.manage().window().maximize();
		
		
		
	}
	
	
}
