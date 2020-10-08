package com.myntra.qa.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.myntra.qa.util.TestUtil;


public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static Actions action;
	
	
	public static void initialization() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
}
}
