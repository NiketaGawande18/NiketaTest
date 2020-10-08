package com.shopcart.qa.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.AddNewProduct;
import com.shopcart.qa.pages.Catalogpage;
import com.shopcart.qa.pages.DashBoardPage;
import com.shopcart.qa.pages.LoginPage;
import com.shopcart.qa.pages.ProductPage;

public class ProductPageTest extends TestBase{
	public static final Logger logger = Logger.getLogger(ProductPageTest.class.getName());
	LoginPage loginpage;
	DashBoardPage dashboardpage;
	Catalogpage catalogpage;
	ProductPage productpage;
	AddNewProduct addnewproduct;
	
	
	public ProductPageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		initialization();
		loginpage=new LoginPage();
		dashboardpage=new DashBoardPage();
		catalogpage=new Catalogpage();
	    productpage=new ProductPage();
	    addnewproduct=new AddNewProduct();
	    action=new Actions(driver);
	    
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboardpage.verifyproductgpage();
	}
	
	@Test
	public void verifyproducttiltle(){
		String protitle=productpage.checkproducttitle();
         System.out.println(protitle);     

	}
	
	@Test
	public void checkclickonproduct() {
		productpage=dashboardpage.verifyproductgpage();
		}
	
	@Test
	public void checkclickonnewproduct() {
		addnewproduct=productpage.verifynewproductlink();
	}
	
	@Test
	public void checkbulkaction() throws Exception {
		productpage.verifyselectall();
	}


	@AfterMethod
	public void shutDown()
	{
		driver.quit();		
	}
	
	
	
}
