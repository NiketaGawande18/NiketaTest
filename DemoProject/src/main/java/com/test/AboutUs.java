package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class AboutUs {

	public static void main(String[] args) {
		//System.setProperty("webdiver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ameet/OneDrive/Desktop/Selenium%20Software/Offline%20Website/index.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
		
		
	}
	
	
	
	

	
	

