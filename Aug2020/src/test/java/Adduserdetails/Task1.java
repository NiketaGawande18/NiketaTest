package Adduserdetails;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public abstract class Task1 {
       
	public static WebDriver driver;
	public static Properties prop;
	
	public Task1(){
		prop=new Properties();
		try {
			//FileInputStream fis=new FileInputStream("D:\\Demo Project\\ShopCart\\src\\main\\java\\com\\shopcart\\qa\\config\\Config.properties");
			FileInputStream fis=new FileInputStream("C:\\Users\\ameet\\git\\AdminLTE\\AdminLTE\\src\\main\\java\\com\\admin\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	
	
	public static void initialization() {
		String browser=prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\file\\chromedriver.exe");
			 driver=new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver.exe");
			driver=new FirefoxDriver();
	}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
}
}
