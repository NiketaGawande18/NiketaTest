package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class abc {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.amazon.in");
        driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
        driver.findElement(By.id("ap_email")).sendKeys("seleniumoar1234@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("*****");
        driver.findElement(By.id("signInSubmit")).click();
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
        driver.get("http://www.gmail.com");


    }
}
