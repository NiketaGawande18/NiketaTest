package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
 
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\New File\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
	
		 driver.get("https://www.redbus.in/");
		 driver.findElement(By.xpath("//span[@class=\"fl icon-calendar_icon-new icon-onward-calendar icon\"]")).click();
		 String date="15-July-2020";
		 String datearr[]=date.split("-");
		 String day=datearr[0];
		 String month= datearr[1];
		 String year=datearr[2];
		 driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		 // //*[@id="rb-calendar_onward_cal"]/table/tbody/tr[5]/td[3]
		 ////*[@id="rb-calendar_onward_cal"]/table/tbody/tr[5]/td[4]
		 	
		 String beforeXpath="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[";
		 String afterXpath="]/td[";
		 
		 final int totaoweekdays = 7;
		 for(int rownum=2;rownum<=7;rownum++) {
			 for(int colnum=1;colnum<=totaoweekdays;colnum++) {
				String dayval= driver.findElement(By.xpath(beforeXpath+rownum+afterXpath+colnum+ "]")).getText();
				 System.out.println(dayval);
			 }
		 }
	}
}
