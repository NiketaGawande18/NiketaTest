package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class ProductFeaturesPage extends TestBase {

	@FindBy(xpath="//*[@id=\"maintab-AdminCatalog\"]/a")
	WebElement cataloglink;
	
	
	
	public ProductFeaturesPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String verifytitle() {
		String title=driver.getTitle();
		System.out.println(title);
		return title;
}
}
