package com.shopcart.qa.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.AddCategoriesPage;
import com.shopcart.qa.pages.AddNewProduct;
import com.shopcart.qa.pages.AttachmentPage;
import com.shopcart.qa.pages.AuthenticationPage;
import com.shopcart.qa.pages.Catalogpage;
import com.shopcart.qa.pages.CategoriesPage;
import com.shopcart.qa.pages.DashBoardPage;
import com.shopcart.qa.pages.LoginPage;
import com.shopcart.qa.pages.ManufacturesPage;
import com.shopcart.qa.pages.MonitoringPage;
import com.shopcart.qa.pages.MyShopPage;
import com.shopcart.qa.pages.ProductAttributePage;
import com.shopcart.qa.pages.ProductFeaturesPage;
import com.shopcart.qa.pages.ProductPage;
import com.shopcart.qa.pages.SuppliersPage;
import com.shopcart.qa.pages.TagsPage;

public class CategoriesPageTest extends TestBase {
	public static final Logger logger = Logger.getLogger(CategoriesPageTest.class.getName());
	LoginPage loginpage;
	DashBoardPage dashboardpage;
	
	String t;
	Catalogpage catalogpage;
	
	CategoriesPage categoriespage;
	
	
	public CategoriesPageTest() {
		super();
	}
	
	
		
		
	@BeforeMethod
	public void Setup() {
		initialization();
		loginpage=new LoginPage();
		dashboardpage=new DashBoardPage();
		catalogpage=new Catalogpage();
	     categoriespage=new CategoriesPage();
	      action=new Actions(driver);
	   
	    loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	    dashboardpage.verifycategoriesgpage();
	}
	
	
	@Test
	public void checktitle() {
		categoriespage.verifycategoriestitle();
	}
	
	@Test
	public void checknewcategories() {
		categoriespage.verifynewcategorieslink();
	}
	
	@Test
	public void checkclickonview() {
		categoriespage.verifyviewpage();
		driver.navigate().back();
	}
	
	@Test
	public void checkclickonrefresh() {
		categoriespage.verifyrefresh();
		
	}
	
	@Test
	public void checkeditlink() throws Exception {
		categoriespage.verifyeditpage();
		driver.navigate().back();
	}
	
	@Test
	public void clickonmoduleandservices() {
		categoriespage.verifymodulesandservices();
	}
	
	@AfterMethod
	public void shutDown()
	{
		driver.quit();		
	}

}
