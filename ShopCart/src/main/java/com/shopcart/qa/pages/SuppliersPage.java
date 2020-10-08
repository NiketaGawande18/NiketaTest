package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class SuppliersPage extends TestBase{

	
	@FindBy(xpath="//*[@id=\"maintab-AdminCatalog\"]/a")
	WebElement cataloglink;
	
	@FindBy(xpath="//*[@id=\"form-supplier\"]/div/div[2]/table/tbody/tr/td[6]/div/div/a")
	WebElement viewpagelink;
	
	public SuppliersPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String verifytitle() {
		return driver.getTitle();
	}
	
	public void verifyviewpage() {
		viewpagelink.click();
	}
}
