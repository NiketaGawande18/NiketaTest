package com.shopcart.qa.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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

public class SuppliersPageTest extends TestBase {
	
	public static final Logger logger = Logger.getLogger(SuppliersPageTest.class.getName());
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
	
	
	
	public SuppliersPageTest() {
		super();
	}
	
	@BeforeMethod
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
	    action=new Actions(driver);
	    Logger.getLogger(SuppliersPageTest.class);
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboardpage.verifysupplierpage();
	}
	
	@Test
	public void checktitle() {
	String title=sp.verifytitle();
	System.out.println(title);
	}
	
	@Test
	public void checkviewpage() {
		sp.verifyviewpage();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	}
	
	@AfterMethod
	public void shutDown()
	{
		driver.quit();		
	}
}
