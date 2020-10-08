package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AngularjsSyllabus {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("file:///C:/Users/ameet/OneDrive/Desktop/JBK%20Offline/angularjs-syllabus.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Download AngularJS Syllabus")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 3000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home")).click();
	}
	
	
}
