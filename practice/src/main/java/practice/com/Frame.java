package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
 public static void main(String[] args) {
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\file\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://classic.crmpro.com/index.html?e=1");
	 driver.findElement(By.name("username")).sendKeys("naveenk");
	 driver.findElement(By.name("password")).sendKeys("test@123");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
