package com.myntra.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.qa.base.BaseClass;

public class Men extends BaseClass
{
 
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")
	WebElement menlink;
	
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div/li[1]/ul/li[2]/a")
	WebElement tshirtlink;
	
	@FindBy(xpath="//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label")
	WebElement checkbox1;
	
	@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[1]/section/div[2]/ul/li/div/label/span")
	WebElement close;
	
	@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")
	WebElement img1;
	
	@FindBy(xpath="//*[@id=\"sizeButtonsContainer\"]/div[2]/div[2]/div[1]/button/p")
	WebElement msize;
	
	@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/div[3]/span[1]/span")
	WebElement addbag;
	
	public Men() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifytitle() {
		return driver.getTitle();
	}
	
	public TshirtPage verifytshirt() {
		action.moveToElement(menlink).perform();
		tshirtlink.click();
		return new TshirtPage();
		
	}
	
	public void verifycheckbox() {
		checkbox1.click();
		
	}
	
	public void clickonremove() {
		close.click();
	}
	
	public void verifyimg1() {
		img1.click();
	}
	
	public void verifysize() {
		msize.click();
	}
	
	public void verifyaddbag() {
		addbag.click();
	}
}
