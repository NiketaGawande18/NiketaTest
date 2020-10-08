package com.datadriven.test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.excelutility.Excelconfig;

public class DataDrivenTest {

	WebDriver driver;
		
		@Test(dataProvider="wordpressname")
		public void logintowordpress(String username,String password) {
			
			 driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://demosite.center/bbpress/wp-login.php");
			driver.findElement(By.id("user_login")).sendKeys(username);
			driver.findElement(By.id("user_pass")).sendKeys(password);
			driver.findElement(By.id("wp-submit")).click();
		}
		
		@DataProvider(name="wordpressname")
		public Object[][] passdata(){
			
			Excelconfig ec=new Excelconfig("C:\\Demo Project\\DataDrivenTest\\src\\com\\testdata\\Halfebay.xlsx");
			
			int rows=ec.getrowcount(0);
					
			Object[][] data=new Object[rows][2];
			
			for(int i=0;i<rows;i++) {
				data[i][0]=ec.getdata(0, i, 0);
				data[i][1]=ec.getdata(0, i, 1);
						
			}
			
			
			return data;
			
		}
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
	}

