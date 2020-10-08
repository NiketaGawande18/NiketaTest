package com.shopcart.qa.pages;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shopcart.qa.base.TestBase;

public class ProductAttributePage extends TestBase {


	@FindBy(xpath="//*[@id=\"maintab-AdminCatalog\"]/a")
	WebElement cataloglink;
	
	@FindBy(xpath="//*[@id=\"submitFilterButtonattribute_group\"]")
	WebElement Searchbtn;
	
	@FindBy(xpath="//*[@id=\"table-attribute_group\"]/thead/tr[2]/th[6]/span/button[2]")
	WebElement resetbtn;
	
	@FindBy(xpath="//*[@id=\"table-attribute_group\"]/thead/tr[2]/th[2]/input")
	WebElement id;
	
	@FindBy(xpath="//*[@id=\"tr_2_1_0\"]/td[6]/div/div/a")
	WebElement viewlink;
	
	@FindBy(xpath="//*[@id=\"desc-attribute-back\"]/i")
    WebElement backtolistlink;	
	
	@FindBy(xpath="//*[@id=\"tr_2_1_0\"]/td[6]/div/div/button")
	WebElement arrowlink;
	
	@FindBy(xpath="//*[@id=\"tr_2_1_0\"]/td[6]/div/div/ul/li[1]/a")
	WebElement editbtn;
	
	@FindBy(xpath="//*[@id=\"fieldset_0\"]/div[3]/a/i")
	WebElement cancelbtn;
	
	@FindBy(xpath="//*[@id=\"attribute_group-empty-filters-alert\"]")
	WebElement alertmsg;
	
	@FindBy(xpath="#desc-attribute_group-import > span > i")
	WebElement importlink;
	
	@FindBy(xpath="//*[@id=\"tr_2_1_0\"]/td[1]/input ")
	WebElement checkbox1;
	
	@FindBy(xpath="//*[@id=\"tr_2_2_1\"]/td[1]/input")
	WebElement checkbox2;
	
	@FindBy(xpath="//*[@id=\"tr_2_3_2\"]/td[1]/input")
	WebElement checkbox3;
	
	@FindBy(xpath="//*[@id=\"form-attribute_group\"]/div/div[3]/div/div/button")
	WebElement bulkactionlink;
	
	@FindBy(xpath="//*[@id=\"form-attribute_group\"]/div/div[3]/div/div/ul/li[1]/a")
	WebElement selectall;
	
	@FindBy(xpath="//*[@id=\"form-attribute_group\"]/div/div[3]/div/div/ul/li[2]/a")
	WebElement  unselectall;
		
	
	public ProductAttributePage() {
		PageFactory.initElements(driver, this);
	}
	
		
	public String verifytitle() {
		String title=driver.getTitle();
		System.out.println(title);
		return title;
		
		
	}
	
	public void verifyidsearch() {
		id.sendKeys("3");
		Searchbtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resetbtn.click();
		
	}
	
	
	public void verifyviewbtnclicking() {
		viewlink.click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		backtolistlink.click();
	}
	
	public EditPage verifyarrowclick() {
		arrowlink.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		editbtn.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		return new EditPage();
	}
	
	public void verifysearchbtn() throws Exception {
		Searchbtn.click();
		Thread.sleep(2000);
		String alert=alertmsg.getText();
		System.out.println(alert);
	}
	
	public CSV_ImportPage verifyimport() {
		importlink.click();
		return new CSV_ImportPage();
	}
	
	
		
	public void verifyselectall() {
		action.moveToElement(bulkactionlink).perform();
		bulkactionlink.click();
		action.moveToElement(selectall).perform();
		selectall.click();
	}
	
	public void verifyunselectall() {
		action.moveToElement(bulkactionlink).perform();
		bulkactionlink.click();
		action.moveToElement(unselectall).perform();
		unselectall.click();
	}
	
	
	}

	

