package com.shopcart.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.shopcart.qa.testutility.WebEventListener;
import com.shopcart.qa.util.TestNGListener;
import com.shopcart.qa.util.TestUtil;

public class TestBase {
    
	public static final Logger logger = Logger.getLogger(TestBase.class.getName());
	public static WebDriver driver;
	public static Properties prop;
	public static Actions action;
	public static Workbook book;
	public static Sheet sheet;
	public  static EventFiringWebDriver e_driver;
	public static TestNGListener eventListener;
	public static WebEventListener listener;
	
	
	public TestBase(){
		prop=new Properties();
		try {
			//FileInputStream fis=new FileInputStream("D:\\Demo Project\\ShopCart\\src\\main\\java\\com\\shopcart\\qa\\config\\Config.properties");
			FileInputStream fis=new FileInputStream("D:\\Demo Project\\ShopCart\\src\\main\\java\\com\\shopcart\\qa\\config\\Config.properties");
			prop.load(fis);
			logger.info("loading config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	

	
	public static void initialization() {
		String log4jConfPath = "D:\\Demo Project\\ShopCart\\src\\main\\java\\com\\shopcart\\qa\\config\\Log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		String browser=prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 driver=new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver.exe");
			driver=new FirefoxDriver();
	}
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		listener = new WebEventListener();
		e_driver.register(listener);
		driver = e_driver;
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
}
	
	
	public static File failed(String testMethodName) {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("user.dir"+"\\Screenshot"+testMethodName+ "_"+".jpg" ));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return src;
	}
	
	SimpleDateFormat date= new SimpleDateFormat();
	
	

}
