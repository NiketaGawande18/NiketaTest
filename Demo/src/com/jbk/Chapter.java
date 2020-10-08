package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Flash.FlashObjectWebDriver;

public class Chapter {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("file:///C:/Users/ameet/OneDrive/Desktop/JBK%20Offline/chapters.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver,"Java By Kiran Videos");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		Thread.sleep(10000);
		//flashApp.callFlashObject("pauseVideo");
		//Thread.sleep(3000);
		//flashApp.callFlashObject("playVideo");
		//Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
}
