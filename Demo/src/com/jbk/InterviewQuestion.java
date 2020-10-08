package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestion {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("file:///C:/Users/ameet/OneDrive/Desktop/JBK%20Offline/corejava-j2ee-selenium-testing-interview-question-answer.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"parentHorizontalTab\"]/div/div[1]/ul[1]/li[1]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"parentHorizontalTab\"]/div/div[1]/ul[1]/li[2]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"parentHorizontalTab\"]/ul/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"parentHorizontalTab\"]/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"parentHorizontalTab\"]/ul/li[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"parentHorizontalTab\"]/div/div[3]/ul[1]/li[1]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"parentHorizontalTab\"]/ul/li[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"parentHorizontalTab\"]/div/div[4]/ul[2]/li[1]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Home")).click();
	}
}
