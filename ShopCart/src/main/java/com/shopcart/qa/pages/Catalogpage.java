package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.shopcart.qa.base.TestBase;

public class Catalogpage extends TestBase{

	Catalogpage catalogpage;
	
	@FindBy(xpath="//*[@id=\"maintab-AdminCatalog\"]/a")
	WebElement cataloglink;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminProducts\"]/a")
	WebElement productlink;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminCategories\"]/a")
	WebElement categorieslink;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminMonitoring\"]/a")
	WebElement monitoringlink;
	
	public  Catalogpage() {
		PageFactory.initElements(driver, this);
	}
	
	/*public ProductPage verifyproductpage(){
		action.moveToElement(cataloglink).perform();
		productlink.click();
		return new ProductPage();
	}*/

	public String verifytitle() {
		return driver.getTitle();
	}
	
}
