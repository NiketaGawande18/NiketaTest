package com.shopcart.qa.pages;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shopcart.qa.base.TestBase;

public class ProductPage extends TestBase
{

	ProductPage productpage;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/div/div[3]/div/div/button") WebElement bulkactionlink;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/div/div[3]/div/div/ul/li[1]/a") WebElement selectalllink;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/div/div[3]/div/div/ul/li[2]/a") WebElement unselectalllink;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/div/div[3]/div/div/ul/li[4]/a") WebElement enablelink;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/div/div[3]/div/div/ul/li[5]/a") WebElement disablelink;
	
	@FindBy(xpath="//*[@id=\"maintab-AdminCatalog\"]/a")
	WebElement cataloglink;
	
	@FindBy(xpath="//*[@id=\"quick_select\"]")
	WebElement quickaccesslink;
	
	@FindBy(xpath="//*[@id=\"header_quick\"]/li/ul/li[1]/a")
	WebElement newcatorieslink;
	
	@FindBy(linkText="New product")
	WebElement newproductlink;
	
	@FindBy(xpath="//*[@id=\"quick_select\"]")
	WebElement quickaccess;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminProducts\"]/a")
	WebElement productlink;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminCategories\"]/a")
	WebElement categorieslink;
	
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String checkproducttitle() {
		
		return driver.getTitle();
	}
	
	public ProductPage verifyproductgpage() {
		action.moveToElement(cataloglink).build().perform();
		productlink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ProductPage();
	}
	public AddNewProduct verifynewproductlink()
	{
		//Select select=new Select(quickaccesslink);
		quickaccess.click();
		//select.selectByIndex(1);
		action.moveToElement(newproductlink).build().perform();
        newproductlink.click();
		return new AddNewProduct();
	}
	
	public void verifyselectall() throws Exception {
		action.moveToElement(bulkactionlink).perform();
		bulkactionlink.click();
		action.moveToElement(bulkactionlink).build().perform();
		selectalllink.click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		action.moveToElement(bulkactionlink).build().perform();
		bulkactionlink.click();
		action.moveToElement(bulkactionlink).build().perform();
		unselectalllink.click();
		Thread.sleep(3000);
		action.moveToElement(bulkactionlink).perform();
		bulkactionlink.click();
		action.moveToElement(bulkactionlink).build().perform();
		enablelink.click();
		Thread.sleep(3000);
		action.moveToElement(bulkactionlink).perform();
		bulkactionlink.click();
		action.moveToElement(bulkactionlink).build().perform();
		disablelink.click();
		
	}
	
	
}
