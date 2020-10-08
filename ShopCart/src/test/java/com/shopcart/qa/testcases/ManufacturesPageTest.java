package com.shopcart.qa.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.AddCategoriesPage;
import com.shopcart.qa.pages.AttachmentPage;
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

public class ManufacturesPageTest  extends TestBase{
	public static final Logger logger = Logger.getLogger(LoginPageTest.class.getName());
	LoginPage loginpage;
	DashBoardPage dashboardpage;
	MyShopPage myshoppage;
	String t;
	Catalogpage catalogpage;
	ProductPage productpage;
	CategoriesPage categoriespage;
	MonitoringPage monitoringpage;
	ProductAttributePage pap;
	ProductFeaturesPage pfp;
	ManufacturesPage mp;
	AttachmentPage ap;
	TagsPage tp;
	SuppliersPage sp;
	AddCategoriesPage acp;
	
	
	public ManufacturesPageTest() {
		super();
	}
	
	@BeforeClass
	public void Setup() {
		initialization();
		loginpage=new LoginPage();
		dashboardpage=new DashBoardPage();
		catalogpage=new Catalogpage();
	    productpage=new ProductPage();
	    categoriespage=new CategoriesPage();
	    monitoringpage=new MonitoringPage();
	    pap=new ProductAttributePage();
	    pfp=new ProductFeaturesPage();
	    ap=new AttachmentPage();
	    tp=new TagsPage();
	    sp=new SuppliersPage();
	    acp=new AddCategoriesPage();
	    mp=new ManufacturesPage();
	    action=new Actions(driver);
	   
	    loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	    dashboardpage.verifymanufacturepage();
	    
		
	}
	
	@Test
	public void checkviewpage() throws Exception {
		mp.verifyviewpage();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	@Test
	public void checkeditpage() throws Exception {
		mp.verifyeditpage();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	
}
