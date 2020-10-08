
package com.shopcart.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.DashBoardPage;
import com.shopcart.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	public static final Logger logger = Logger.getLogger(LoginPageTest.class.getName());
	LoginPage loginpage;
	DashBoardPage dashboardpage;
	
	
	public LoginPageTest(){
		super();
	}
	@BeforeMethod
	public void Setup() {
		 
		initialization();
		loginpage=new LoginPage();
		
	}
	
	@Test()
	public void loginTitletest() {
		String title=loginpage.validatetitletest();
		Assert.assertEquals(title, "SHOPCART > Administration panel (PrestaShop™)");
	}
	
	@Test()
	public void shopcartlogotest() {
		boolean flag=loginpage.validatelogotest();
		Assert.assertTrue(flag);
	}
	
	@Test()
	public void LoginTest() {
		dashboardpage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		logger.info("logging successfully..");
	}
	
	@Test
	
	public void checkimage() {
		loginpage.verifyimage();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
