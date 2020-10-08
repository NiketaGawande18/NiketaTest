package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.util.Xls_Reader;



public class AddNewProduct extends TestBase {

	
	
	@FindBy(xpath="//*[@id=\"name_1\"]") WebElement Name;
	
	@FindBy(xpath="//*[@id=\"visibility\"]") WebElement visibility;
	
	@FindBy(xpath="//*[@id=\"available_for_order\"]") WebElement afo;
	
	@FindBy(xpath="//*[@id=\"online_only\"]") WebElement onlineonly;
	
	@FindBy(xpath="//*[@id=\"tinymce\"]") WebElement descript;
	
	@FindBy(css="#product-informations > div.panel-footer > button:nth-child(2) > i")  WebElement save;
	
	@FindBy(xpath="//*[@id=\"product-informations\"]/div[16]/button[2]/i") WebElement savestay;
	
	@FindBy(css="#product-informations > div.panel-footer > a > i") WebElement cancel;
	
	@FindBy(xpath="//*[@id=\"simple_product\"]") WebElement simpleproduct;
	
	@FindBy(xpath="//*[@id=\"pack_product\"]") WebElement pproduct;
	
	@FindBy(xpath="//*[@id=\"virtual_product\"]") WebElement vproduct;
	
	@FindBy(xpath="//*[@id=\"condition\"]") WebElement condi;
	
	@FindBy(xpath="//*[@id=\"show_price\"]") WebElement showprice;
	
	@FindBy(xpath="//*[@id=\"reference\"]") WebElement refcode;
	
	public AddNewProduct() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyaddnew() {
		
	Xls_Reader reader=new Xls_Reader("D:\\Demo Project\\ShopCart\\src\\main\\java\\com\\shopcart\\qa\\testdata\\AddnewProduct.xlsx");
	
	String name=reader.getCellData("Sheet1", "Name", 2);
	System.out.println(name);
	
	String r_code=reader.getCellData("Sheet1", "Reference Code", 2);
	System.out.println(r_code);
	
	String visi=reader.getCellData("Sheet1", "visibility", 2);
	System.out.println(visi);
	
	String option=reader.getCellData("Sheet1", "options", 2);
	System.out.println(option);
	
	String condition=reader.getCellData("Sheet1", "condition", 2);
	System.out.println(condition);
	
	this.Name.sendKeys(name);
	this.refcode.sendKeys(r_code);
	Select select=new Select(visibility);
	this.visibility.sendKeys(visi);
	
	
	
	}
}