package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class CategoriesPage extends TestBase
{

	
	@FindBy(xpath="//*[@id=\"page-header-desc-category-modules-list\"]/i")
	WebElement modulesandservice;
	
	@FindBy(xpath="//*[@id=\"maintab-AdminCatalog\"]/a")
	WebElement cataloglink;
	

	@FindBy(xpath="//*[@id=\"quick_select\"]")
	WebElement quickaccesslink;
	
	@FindBy(xpath="//*[@id=\"header_quick\"]/li/ul/li[1]/a")
	WebElement newcategorieslink;
	
	@FindBy(xpath="//*[@id=\"tr_2_3_0\"]/td[6]/div/div/a") 
	WebElement viewlink;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[5]/div/div[1]/div[1]/button/i")
	WebElement refreshlink;
	
	@FindBy(xpath="//*[@id=\"tr_2_3_0\"]/td[6]/div/div/ul/li[1]/a")
    WebElement editlink;	
	
	@FindBy(xpath="//*[@id=\"tr_2_3_0\"]/td[6]/div/div/button")
	WebElement arrowlink;
	
	@FindBy(xpath="//*[@id=\"modules_list_container_tab_modal\"]/div[3]/a")
    WebElement link;
	
	public  CategoriesPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public AddNewProduct verifynewcategorieslink()
	{
		quickaccesslink.click();
		action.moveToElement(newcategorieslink).build().perform();
		newcategorieslink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new AddNewProduct();
	}
		
	public String verifycategoriestitle() {
		String titlecatogories=driver.getTitle();
		System.out.println(titlecatogories);
		return titlecatogories;
	
	}
	
	public void verifyviewpage() {
		viewlink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void verifyrefresh() {
		refreshlink.click();
	}
	
	public void verifyeditpage() throws Exception {
		action.moveToElement(arrowlink).build().perform();
		arrowlink.click();
		action.moveToElement(editlink).build().perform();
		editlink.click();
		Thread.sleep(3000);
	}
	
	public void verifymodulesandservices() {
		
		action.moveToElement(modulesandservice).build().perform();
		modulesandservice.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		link.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
