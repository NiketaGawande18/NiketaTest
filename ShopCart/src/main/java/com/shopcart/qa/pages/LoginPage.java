package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	
	LoginPage loginpage;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement Passwd;

	@FindBy(xpath="//*[@id=\"login_form\"]/div[3]/button")
	WebElement submitlogin;
	
		
	@FindBy(xpath="//*[@id=\"logo\"]")
	WebElement logo;
	
	@FindBy(css="#shop-img > img") WebElement image;
	
	public  LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatelogotest() {
		return logo.isDisplayed();
	}
	
	public String validatetitletest() {
		return driver.getTitle();
	}
	
	public boolean verifyimage() {
		boolean img=image.isEnabled();
		return img;
	}
	
		
	public DashBoardPage login(String uname,String pwrd) {
	    Email.sendKeys(uname);
		Passwd.sendKeys(pwrd);
		submitlogin.click();
		return new DashBoardPage();
	}
}
