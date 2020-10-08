package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest {

	WebDriver driver=null;
	
	
	@BeforeClass
	public void set() {
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/ameet/OneDrive/Desktop/JBK%20Offline/index.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	}
	
	@Test
	public void checktitle() {
		String expt=driver.findElement(By.xpath("//*[@id=\"mainleft\"]/h1")).getText();
		String act="Java By Kiran";
		Assert.assertEquals(act,expt);
	}
	
	@Test
	public void checktitle1() {
		String expt=driver.findElement(By.xpath("//*[@id=\"mainleft\"]/p/strong")).getText();
		String act="Java & Selenium Training Institute";
		Assert.assertEquals(act,expt);
	}
	
	@Test
	public void checktitle2() {
		String expt=driver.findElement(By.xpath("//*[@id=\"mainright\"]/h4[1]")).getText();
		String act="Official Enquiry -";
		Assert.assertEquals(act,expt);
	}
	
	
}
