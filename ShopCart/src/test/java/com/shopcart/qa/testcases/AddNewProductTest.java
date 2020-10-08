package com.shopcart.qa.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
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
import com.shopcart.qa.util.Xls_Reader;

public class AddNewProductTest extends TestBase {

	public static final Logger logger = Logger.getLogger(AddNewProductTest.class.getName());
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
	AuthenticationPage aup;
    ExtentReports extent;
    ExtentTest extentTest;
	AddNewProduct addnewproduct;
	Xls_Reader reader;
	
	public AddNewProductTest() {
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
	    mp=new ManufacturesPage();
	    aup= new AuthenticationPage();
	    addnewproduct=new AddNewProduct();
        action=new Actions(driver);
        reader=new Xls_Reader("D:\\Demo Project\\ShopCart\\src\\main\\java\\com\\shopcart\\qa\\testdata\\AddNewProducts.xlsx");
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		productpage.verifynewproductlink();
	}
	

	@Test()
	public void checkaddnew( ) {
		
		addnewproduct.verifyaddnew();
		
		
	}
}
