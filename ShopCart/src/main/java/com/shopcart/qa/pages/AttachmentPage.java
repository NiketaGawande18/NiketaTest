package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class AttachmentPage extends TestBase {

	@FindBy(xpath="//*[@id=\"maintab-AdminCatalog\"]/a")
	WebElement cataloglink;
		
	
	public AttachmentPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String verifytitle() {
		return driver.getTitle();
	}
	
}
