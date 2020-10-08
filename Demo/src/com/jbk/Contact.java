package com.jbk;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Contact {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("file:///C:/Users/ameet/OneDrive/Desktop/JBK%20Offline/java-classes-contact-pune.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
//		WebElement name=driver.findElement(By.id("name"));
//				name.sendKeys("abc");
//		WebElement email=driver.findElement(By.name("email"));
//		email.sendKeys("abc@gmail.com");
//		WebElement mob=driver.findElement(By.name("mob"));
//		mob.sendKeys("9874563218");
//		Select select=new Select(driver.findElement(By.name("regarding")));
//		select.selectByVisibleText("Selenium Testing");
//		select.selectByIndex(2);
//		driver.findElement(By.name("message")).sendKeys("Please Send the course details on my mail..");
		js.executeScript("window.scrollBy(0, 1000)");
		driver.findElement(By.id("submit_btn")).click();
		File file=new File("C:\\Users\\ameet\\OneDrive\\Desktop\\ContactDetails.xlsx");
		Workbook book=Workbook.getWorkbook(file);
		Sheet sheet=book.getSheet(0);
		Cell cell=sheet.getCell(0,0);
		
		
		System.out.println(1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div[6]/span/button[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"top\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Home")).click();
		
	}
}
