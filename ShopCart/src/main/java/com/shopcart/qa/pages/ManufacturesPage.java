package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class ManufacturesPage extends TestBase {

	@FindBy(xpath="//*[@id=\"form-manufacturer\"]/div/div[2]/table/tbody/tr/td[7]/div/div/a")
	WebElement viewlink;
	
	@FindBy(xpath="//*[@id=\"form-address\"]/div/div[2]/table/tbody/tr/td[8]/div/div/a")
    WebElement editlink;
	
	@FindBy(xpath="//*[@id=\"maintab-AdminCatalog\"]/a")
	WebElement cataloglink;
	
	@FindBy(xpath="//*[@id=\"header_quick\"]/li/ul/li[2]/a") WebElement Manulink;
	
	@FindBy(xpath="//*[@id=\"quick_select\"]")
	WebElement quickaccesslink;
	
		
	public ManufacturesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyviewpage() {
		viewlink.click();
	}
	
	public void verifyeditpage() {
		editlink.click();
	}
	
	
	public AddnewManufactureAddress verifyaddnewmanuaddress() {
		quickaccesslink.click();
		action.moveToElement(Manulink).build().perform();
        Manulink.click();
		return new AddnewManufactureAddress();
	}
	
	
}
