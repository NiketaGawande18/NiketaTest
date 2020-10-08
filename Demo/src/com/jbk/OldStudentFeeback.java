package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OldStudentFeeback {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("file:///C:/Users/ameet/OneDrive/Desktop/JBK%20Offline/old-student-feedback-java-by-kiran.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, 12000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Home")).click();
	}
	
}
