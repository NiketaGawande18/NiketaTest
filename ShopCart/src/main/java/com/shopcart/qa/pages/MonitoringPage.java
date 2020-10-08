package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class MonitoringPage extends TestBase {

	
	
	@FindBy(xpath="//*[@id=\"maintab-AdminCatalog\"]/a")
	WebElement cataloglink;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminTracking\"]/a")
	WebElement monitoringlink;
	
	@FindBy(xpath="//*[@id=\"form-empty_categories\"]/div/div[3]/table/thead/tr[2]/th[1]/input")
	WebElement id;
	
	@FindBy(xpath="//*[@id=\"submitFilterButtonempty_categories\"]")
	WebElement searchbtn;
	
	@FindBy(xpath="//*[@id=\"form-empty_categories\"]/div/div[3]/table/thead/tr[2]/th[5]/span/button[2]")
	WebElement resetbtn;
	
	public MonitoringPage() {
		PageFactory.initElements(driver, this);
	}		
	
		public void verifyidsearch() {
			id.sendKeys("10");
			searchbtn.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			resetbtn.click();
		}
		
		
	
}
