package com.shopcart.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.DashBoardPage;
import com.shopcart.qa.pages.LoginPage;
import com.shopcart.qa.pages.MyShopPage;

public class MyShopPageTest extends TestBase {
	public static final Logger logger = Logger.getLogger(MyShopPageTest.class.getName());
	LoginPage loginpage;
	DashBoardPage dashboardpage;
	MyShopPage myshoppage;
	
	public MyShopPageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		initialization();
		loginpage=new LoginPage();
		dashboardpage=new DashBoardPage();
		myshoppage=new MyShopPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboardpage.verifymyshop();
	}
	
	@Test
	public void checkcontactlink() {
		boolean logo2=myshoppage.checkcontactlink();
		Assert.assertTrue(logo2);
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
