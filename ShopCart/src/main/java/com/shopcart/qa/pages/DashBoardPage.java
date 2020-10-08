package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.shopcart.qa.base.TestBase;

public class DashBoardPage extends TestBase{

	
	@FindBy(xpath="//*[@id=\"header_foaccess\"]/span[1]")
	WebElement myshoplink;
	
	@FindBy(xpath="//*[@id=\"maintab-AdminDashboard\"]/a")
	WebElement dashboardlink;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminProducts\"]/a")
	WebElement productlink;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminCategories\"]/a")
	WebElement categorieslink;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminManufacturers\"]/a")
	WebElement manufacturelink;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminAttributesGroups\"]/a")
	WebElement attributelink;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminTracking\"]/a")
	WebElement monitoringlink;
	
	@FindBy(xpath="//*[@id=\"maintab-AdminCatalog\"]/a")
	WebElement cataloglink;
		
	@FindBy(xpath="//*[@id=\"subtab-AdminAttachments\"]/a")
	WebElement attachmentlink;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminSuppliers\"]/a")
	WebElement supplierlink;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminTags\"]/a")
	WebElement taglink;
	
	@FindBy(xpath="//*[@id=\"quick_select\"]")
	WebElement quickaccesslink;
	
	@FindBy(xpath="//*[@id=\"page-header-desc-configuration-switch_demo\"]/i")
	WebElement demomode;
	
	@FindBy(linkText="New product")
	WebElement newproductlink;
	
	@FindBy(xpath="//*[@id=\"header_shopversion\"]")
	WebElement prestashop;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminFeatures\"]/a")
	WebElement featurelink;
	
	@FindBy(partialLinkText="PrestaShop Marketplace")
	WebElement marketplacelink;
	
	@FindBy(partialLinkText="Create Account")
    WebElement Createaccountlink;
	
	@FindBy(xpath="//*[@id=\"employee_infos\"]/a/span[1]/img")
	WebElement systadminlink;
	
	@FindBy(xpath="//*[@id=\"calendar_form\"]/div[1]/button[2]")
	WebElement monthbtn;
	
	@FindBy(xpath="//*[@id=\"calendar_form\"]/div[1]/button[3]") WebElement yearbtn;
	
	@FindBy(xpath="//*[@id=\"calendar_form\"]/div[1]/button[4]") WebElement day1btn;
	
	@FindBy(xpath="//*[@id=\"calendar_form\"]/div[1]/button[5]") WebElement month1btn;
	
	@FindBy(xpath="//*[@id=\"calendar_form\"]/div[1]/button[6]") WebElement year1btn;
	
	@FindBy(xpath="//*[@id=\"psaddonsconnect\"]/div[2]/a") WebElement connecttolink;
	
	@FindBy(xpath="//*[@id=\"datepickerExpand\"]") WebElement calender;
	
	@FindBy(xpath="//*[@id=\"modal_addons_connect\"]/div/div/div[1]/button") WebElement closeconnectlink;
	
	public MyShopPage verifymyshop() {
		myshoplink.click();
		return new MyShopPage();
	}
	
	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}
	
		
	public void verifypresta() {
		 boolean label=prestashop.isDisplayed();
	  Assert.assertTrue(label);
	}
	
	public String verifytitle() {
		return driver.getTitle();
	}
	
	public DashBoardPage verifydashboardpage() {
		action.moveToElement(dashboardlink).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new DashBoardPage();
	}
	
	public ProductPage verifyproductgpage() {
		action.moveToElement(cataloglink).build().perform();
		productlink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		return new ProductPage();
		}
	
	public AddNewProduct verifynewproductlink()
	{
		//Select select=new Select(quickaccesslink);
		
		//select.selectByIndex(1);
		quickaccesslink.click();
		action.moveToElement(newproductlink).build().perform();
		newproductlink.click();
		return new AddNewProduct();
	}
	
	public CategoriesPage verifycategoriesgpage() {
		action.moveToElement(cataloglink).build().perform();
		categorieslink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new CategoriesPage();
	}
	
	public   ManufacturesPage verifymanufacturepage() {
		action.moveToElement(cataloglink).build().perform();
		manufacturelink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ManufacturesPage();
	}
	
	
	public MonitoringPage verifymonitoringgpage() {
		action.moveToElement(cataloglink).build().perform();
		monitoringlink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new MonitoringPage();
	}
	
	public   SuppliersPage verifysupplierpage() {
		action.moveToElement(cataloglink).build().perform();
		supplierlink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new SuppliersPage();
	}
	
	public   TagsPage verifytagpage() {
		action.moveToElement(cataloglink).build().perform();
		taglink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new TagsPage();
	}
	public   ProductFeaturesPage verifyfeaturegpage() {
		action.moveToElement(cataloglink).build().perform();
		featurelink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ProductFeaturesPage();
	}

	public   AttachmentPage verifyattachmentpage() {
		action.moveToElement(cataloglink).build().perform();
		attachmentlink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new AttachmentPage();
		
	}
	public   ProductAttributePage verifyattributegpage() {
		action.moveToElement(cataloglink).build().perform();
		attributelink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ProductAttributePage();
	}
	 
	public void verifymarketplace() {
		marketplacelink.click();
	}
		
	public AuthenticationPage verifyauthentication() {	
	action.moveToElement(Createaccountlink).perform();
     return new AuthenticationPage();
	
	}
	
	public void verifydemomode() {
		demomode.click();
		if(demomode.isSelected()) {
			demomode.click();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void verifymonthbtn() {
		monthbtn.click();
	}
	
	public void verifymonth1btn() {
		month1btn.click();
	}
	
	public void verifyyear1btn() {
		year1btn.click();
	}
	public void verifyyearbtn() {
		yearbtn.click();
	}
	
	public void verifyday1btn() {
		day1btn.click();
	}
	
	public void verifycalender() {
		calender.click();
		if(calender.isSelected()) {
			calender.click();
		}
	}
	
	public void verifyconnectlink() {
		connecttolink.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeconnectlink.click();
	}
	
	}
	
   






