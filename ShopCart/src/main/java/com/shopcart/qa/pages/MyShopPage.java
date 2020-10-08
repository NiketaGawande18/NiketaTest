package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class MyShopPage extends TestBase {
	
	MyShopPage myshoppage;

	@FindBy(xpath="//*[@id=\"contact-link\"]/a")
	WebElement logo1;
	
	
	public MyShopPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean checkcontactlink()
	{
		
		return logo1.isDisplayed();
		
	}
}
