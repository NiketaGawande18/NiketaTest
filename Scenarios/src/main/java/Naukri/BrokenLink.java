package Naukri;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrokenLink {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com");
	//List<WebElement> links=driver.findElements(By.tagName("a"));
	//System.out.println(links.size());
}
}
