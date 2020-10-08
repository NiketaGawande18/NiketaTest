package practice.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alertpopup {
	
	WebDriver driver;
 
	@BeforeClass
	public void init() {
	 System.setProperty("webdriver.chrome.driver", "C:\\file\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.spicejet.com/");
	}
	 
	@Test
	public void test1() {
	 WebElement roundtrip= driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]"));
	roundtrip.click();
	
	Select select=new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")));
	select.selectByValue("Mumbai");
	Select select1=new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]")));
	select1.selectByValue("Pune");
	
	}
}

