package com.shopcart.qa.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
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

public class DashBoardPageTest extends TestBase{

	public static final Logger logger = Logger.getLogger(DashBoardPageTest.class.getName());
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
	
	public DashBoardPageTest() {
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
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	
	@Test
	public void checkclickonmyshop() {
		myshoppage=dashboardpage.verifymyshop();
		
	}
	 @Test
	 public void checkpresta() {
		dashboardpage.verifypresta();
		 
	 }
	
	@Test
	public void checktitle() {
     String title=dashboardpage.verifytitle();
     System.out.println(title);
  
	}
	
	@Test(groups="clicking menus")
	public void checkclickondashboard() {
		dashboardpage=dashboardpage.verifydashboardpage();
		}

	@Test(groups="clicking menus")
	public void checkclickonproduct() {
		productpage=dashboardpage.verifyproductgpage();
		}

	@Test(groups="clicking menus")
	public void checkclickoncategories() {
		
		categoriespage=dashboardpage.verifycategoriesgpage();
		
	}
	
	@Test(groups="clicking menus")
	public void checkclickonmanufacture() {
		mp=dashboardpage.verifymanufacturepage();
		
	}
	
	@Test(groups="clicking menus")
	public void checkclickonmonitoring() {
		monitoringpage= dashboardpage.verifymonitoringgpage();
		
	}
		
	@Test(groups="clicking menus")
	public void checkclickonsupplier() {
	sp=	dashboardpage.verifysupplierpage();
		
	}
	@Test(groups="clicking menus")
	public void checkclickontag() {
		tp=dashboardpage.verifytagpage();
		
	}
	@Test(groups="clicking menus")
	public void checkclickonattachment() {
		ap=dashboardpage.verifyattachmentpage();
		
	}

	@Test(groups="clicking menus")
	public void checkclickonattribute() {
		pap=dashboardpage.verifyattributegpage();
		
	}

	@Test
	public void checkclickonfeature() {
		pfp=dashboardpage.verifyfeaturegpage();
		
	}
	
	@Test
	public void checkclickonmarketplace() {
		dashboardpage.verifymarketplace();
	}
	
	@Test(groups="clicking menus")
	public void checkclickonnewproduct() {
		addnewproduct=dashboardpage.verifynewproductlink();
	}

	@Test
	public void checkdemomode() {
		dashboardpage.verifydemomode();
	}
	
	
	@Test
	public void clickonmonth() {
		dashboardpage.verifymonthbtn();
	}
	
	@Test
	public void clickonmonth1() {
		dashboardpage.verifymonth1btn();
	}
	
	@Test
	public void clickonyear() {
		dashboardpage.verifyyearbtn();
	}
	
	@Test
	public void clickonyear1() {
		dashboardpage.verifyyear1btn();
	}
	
	@Test
	public void clickonday1() {
		dashboardpage.verifyday1btn();
	}
	
	@Test
	public void clickonconnect() {
		dashboardpage.verifyconnectlink();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@Test
	public void clickoncalender() {
		dashboardpage.verifycalender();
	}
	
	
	@AfterMethod
	public void shutDown()
	{
		driver.quit();		
	}

}
