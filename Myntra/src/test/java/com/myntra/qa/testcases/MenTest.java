package com.myntra.qa.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.myntra.qa.base.BaseClass;
import com.myntra.qa.pages.Men;
import com.myntra.qa.pages.TshirtPage;

public class MenTest extends BaseClass{

	Men men;
	TshirtPage tshirtpage;
	
	
	public MenTest() {
		super();
		
	}
	
	
	@BeforeClass
	public void setup() {
		initialization();
		men=new Men();
		tshirtpage=new TshirtPage();
		action=new Actions(driver);
	}
	
	@Test(priority=1)
	public void checktitle() {
		String title=men.verifytitle();
		System.out.println(title);
	}
	
	@Test(priority=2)
	public void checkclickon() {
		tshirtpage=men.verifytshirt();
	}
	
	@Test(priority=3)
	public void clickoncheckbox() {
		men.verifycheckbox();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*@Test
	public void clickonremove() {
		men.clickonremove();
	}*/
	
	/*@Test(priority=4)
	public void clickonimg1() {
		men.verifyimg1();
	}*/
	
		@Test
	public void clickonaddbag() {
		men.verifyaddbag();
	}
}
