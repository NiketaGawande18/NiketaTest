package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.util.Xls_Reader;

public class AddnewManufactureAddress extends TestBase{

	@FindBy(id="lastname") WebElement lastname;
	
	@FindBy(id="firstname") WebElement firstname;
	
	@FindBy(id="address1") WebElement address1;
	
	@FindBy(id="address2") WebElement address2;
	
	@FindBy(id="postcode") WebElement postcode;
	
	@FindBy(id="city") WebElement city;
	
	@FindBy(id="id_country") WebElement country;
	
	@FindBy(id="id_state") WebElement id_state;
	
	@FindBy(id="phone") WebElement phone;
	
	@FindBy(id="phone_mobile") WebElement phone_mobile;
	
	@FindBy(id="other") WebElement other;
	
    @FindBy(xpath="//*[@id=\"address_form_submit_btn\"]/i") WebElement savebtn;
    
    @FindBy(xpath="//*[@id=\"fieldset_0\"]/div[3]/a/i")  WebElement cancelbtn;
    
    
   public AddnewManufactureAddress() {
	PageFactory.initElements(driver, this);
}
   
   public void addnew() {
	   Xls_Reader reader=new Xls_Reader("D:\\Demo Project\\ShopCart\\src\\main\\java\\com\\shopcart\\qa\\testdata\\AddNewManufactureAddress.xlsx");
	   String lastname=reader.getCellData("Sheet1", "lastname", 2);
	   System.out.println(lastname);
	   
	   String firstname=reader.getCellData("Sheet1", "firstname", 2);
	   System.out.println(firstname);
	   
	   String address=reader.getCellData("Sheet1", "address", 2);
	   System.out.println(address);
	   
	   String address2=reader.getCellData("Sheet1", "address2", 2);
	   System.out.println(address2);
	   
	   String zipcode=reader.getCellData("Sheet1", "zipcode", 2);
	   System.out.println(zipcode);
	   
	   String city=reader.getCellData("Sheet1", "city", 2);
	   System.out.println(city);
	   
	   String country=reader.getCellData("Sheet1", "country", 2);
	   System.out.println(country);
	   
	   String state=reader.getCellData("Sheet1", "state", 2);
	   System.out.println(state);
	   
	   String phone=reader.getCellData("Sheet1", "homephone", 2);
	   System.out.println(phone);
	   
	   String mobile=reader.getCellData("Sheet1", "mobilephone", 2);
	   System.out.println(mobile);
	   
	   String other=reader.getCellData("Sheet1", "other", 2);
	   System.out.println(other);
	   
	   
	   this.lastname.sendKeys(lastname);
	   this.firstname.sendKeys(firstname);
	   this.address1.sendKeys(address);
	   this.address2.sendKeys(address2);
	   this.postcode.sendKeys(zipcode);
	   this.city.sendKeys(city);
	   this.country.sendKeys(country);
	   this.id_state.sendKeys(state);
	   this.phone.sendKeys(phone);
	   this.phone_mobile.sendKeys(mobile);
	   this.other.sendKeys(other);
	  savebtn.click();
	  
   }
	
}
