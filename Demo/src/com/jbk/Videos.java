package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Videos {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("file:///C:/Users/ameet/OneDrive/Desktop/JBK%20Offline/java-by-kiran-videos.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);
		driver.findElement(By.id("youmax-search-box")).sendKeys("Collections" +Keys.ENTER);
		//Actions action=new Actions(driver);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, 5000)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"top\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Home")).click();
		
		
	}
}
