package com.extra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jbk.HomePage;

public class test {

	public WebDriver driver;
	public HomePage homepage;
	test T=new test();
	
	@BeforeMethod
	public void launchbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("file:///C:/Users/ameet/OneDrive/Desktop/JBK%20Offline/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);
		homepage=new HomePage();
	}
	
	List<WebElement> listmenu=driver.findElements(By.linkText("li"));
	
	
	public String listmenutest() {
		String menulist=null;
		for(WebElement menu:listmenu) {
			menulist=menu.getText();
		}
		return menulist;
		
		
	}
	 
	
	@Test
	public void test1() {
		T.listmenutest();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
