package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
 public static void main(String[] args) {
	 
	 System.setProperty("WebDriver.Chrome.driver", "C:chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("file:///C:/Users/ameet/OneDrive/Desktop/Selenium%20Software/Offline%20Website/index.html");
	 WebElement username=driver.findElement(By.id("email"));
	 username.sendKeys("kiran@gmail.com");
	 
	 WebElement pwd=driver.findElement(By.id("password"));
	 pwd.sendKeys("123456");
	 
	 WebElement login=driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
	 login.click();
}
}
