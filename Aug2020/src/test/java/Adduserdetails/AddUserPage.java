package Adduserdetails;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.util.Utility;
import com.qa.util.Xls_Reader;

import jxl.Workbook;

public class AddUserPage {

	WebDriver driver;
	Xls_Reader reader = new Xls_Reader("C:\\Demo Project\\Aug2020\\src\\main\\java\\com\\utility\\Userdata.xlsx");;
	public Properties prop;
	XSSFWorkbook workbook;
	 XSSFSheet sheet;
	 XSSFRow row ;
	 XSSFCell cell;
	
	@BeforeMethod
	public void setup() throws Exception {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Demo Project\\Aug2020\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	//user data added
	@Test
	public void checkuserdetails() {
		
		WebElement username=driver.findElement(By.xpath("//*[@id='username']"));
		WebElement mobile=driver.findElement(By.xpath("//*[@id='mobile']"));
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		WebElement course=driver.findElement(By.xpath("//*[@id='course']"));
		WebElement male=driver.findElement(By.xpath("//*[@id='Male']"));
		WebElement female=driver.findElement(By.xpath("//*[@id='Female']"));
		WebElement state=driver.findElement(By.xpath("//select"));
		WebElement password=driver.findElement(By.xpath("//*[@id='password']"));
		WebElement submit=driver.findElement(By.xpath("//*[@id='submit']"));
		String Username=reader.getCellData("Sheet1", "Username", 2);
		System.out.println(Username);
		String Mobile=reader.getCellData("Sheet1", "Mobile", 2);
		System.out.println(Mobile);
		String Email=reader.getCellData("Sheet1", "Email", 2);
		System.out.println(Email);
		String Course=reader.getCellData("Sheet1", "Courses", 2);
		System.out.println(Course);
		String Gender=reader.getCellData("Sheet1", "Gender", 2);
		System.out.println(Gender);
		String State=reader.getCellData("Sheet1", "State", 2);
		System.out.println(State);
		String Password=reader.getCellData("Sheet1", "Password", 2);
		System.out.println(Password);
		
		username.sendKeys(Username);
		mobile.sendKeys(Mobile);
		email.sendKeys(Email);
		course.sendKeys(Course);
		if(Gender.contains("Male")) {
			male.click();
		}else if(Gender.contains("Female")) {
			female.click();
		}
		state.sendKeys(State);
		password.sendKeys(Password);
		submit.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actual=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(actual, "User Added Successfully. You can not see added user.");
		
	}

//check user are added sucessfully or not in userlist
	@Test()
	public void checkAddUserFlow() throws Exception {
	

		WebElement username=driver.findElement(By.xpath("//*[@id='username']"));
		WebElement mobile=driver.findElement(By.xpath("//*[@id='mobile']"));
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		WebElement course=driver.findElement(By.xpath("//*[@id='course']"));
		WebElement male=driver.findElement(By.xpath("//*[@id='Male']"));
		WebElement female=driver.findElement(By.xpath("//*[@id='Female']"));
		WebElement state=driver.findElement(By.xpath("//select"));
		WebElement password=driver.findElement(By.xpath("//*[@id='password']"));
		WebElement submit=driver.findElement(By.xpath("//*[@id='submit']"));
		String Username=reader.getCellData("Sheet1", "Username", 2);
		System.out.println(Username);
		String Mobile=reader.getCellData("Sheet1", "Mobile", 2);
		System.out.println(Mobile);
		String Email=reader.getCellData("Sheet1", "Email", 2);
		System.out.println(Email);
		String Course=reader.getCellData("Sheet1", "Courses", 2);
		System.out.println(Course);
		String Gender=reader.getCellData("Sheet1", "Gender", 2);
		System.out.println(Gender);
		String State=reader.getCellData("Sheet1", "State", 2);
		System.out.println(State);
		String Password=reader.getCellData("Sheet1", "Password", 2);
		System.out.println(Password);
		
		username.sendKeys(Username);
		mobile.sendKeys(Mobile);
		email.sendKeys(Email);
		course.sendKeys(Course);
		if(Gender.contains("Male")) {
			male.click();
		}else if(Gender.contains("Female")) {
			female.click();
		}
		state.sendKeys(State);
		password.sendKeys(Password);
		submit.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actual=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(actual, "User Added Successfully. You can not see added user.");
		
		Thread.sleep(5000);
		// click user
		WebElement userlink=driver.findElement(By.linkText("Users"));
		userlink.click();
		
		List<WebElement> unameList = driver.findElements(By.xpath("//tr//td[2]"));
		boolean flag=true;
		for (WebElement users : unameList) {
			if ("Niketa".equals(users.getText())) {
				flag=true;
				break;
			} else {
				
				System.out.println("Newly added user is not avaliable in user table");
				break;
			}
		}
		
		Assert.assertTrue(flag);
	}

	//dropdown values of state of sequences is correctly printed or not
	@Test()
	public void checkStatesList() throws Exception {
	
		WebElement username=driver.findElement(By.xpath("//*[@id='username']"));
		WebElement mobile=driver.findElement(By.xpath("//*[@id='mobile']"));
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		WebElement course=driver.findElement(By.xpath("//*[@id='course']"));
		WebElement male=driver.findElement(By.xpath("//*[@id='Male']"));
		WebElement female=driver.findElement(By.xpath("//*[@id='Female']"));
		WebElement state=driver.findElement(By.xpath("//select"));
		WebElement password=driver.findElement(By.xpath("//*[@id='password']"));
		WebElement submit=driver.findElement(By.xpath("//*[@id='submit']"));
		String Username=reader.getCellData("Sheet1", "Username", 2);
		System.out.println(Username);
		String Mobile=reader.getCellData("Sheet1", "Mobile", 2);
		System.out.println(Mobile);
		String Email=reader.getCellData("Sheet1", "Email", 2);
		System.out.println(Email);
		String Course=reader.getCellData("Sheet1", "Courses", 2);
		System.out.println(Course);
		String Gender=reader.getCellData("Sheet1", "Gender", 2);
		System.out.println(Gender);
		String State=reader.getCellData("Sheet1", "State", 2);
		System.out.println(State);
		String Password=reader.getCellData("Sheet1", "Password", 2);
		System.out.println(Password);
		
		username.sendKeys(Username);
		mobile.sendKeys(Mobile);
		email.sendKeys(Email);
		course.sendKeys(Course);
		if(Gender.contains("Male")) {
			male.click();
		}else if(Gender.contains("Female")) {
			female.click();
		}
		state.sendKeys(State);
		password.sendKeys(Password);
		submit.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actual=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(actual, "User Added Successfully. You can not see added user.");
		
					
		Thread.sleep(5000);
		
		
		String[] exp = {"--Select State--","Maharashtra","Delhi","HP","Punjab"};
		 WebElement dropdown = driver.findElement(By.xpath("//Select"));  
		 Select select = new Select(dropdown);  

		 List<WebElement> options = select.getOptions();  
		 for(WebElement we:options)  
		 {  
		  boolean match = false;
		  for (int i=0; i<exp.length; i++){
		      if (we.getText().equals(exp[i])){
		       match = true;
		      }
		    }
		 
		  Assert.assertTrue(match );
		  System.out.println(we.getText());

		 }  
		 
	}

	//check cancel button working or not
	@Test()
	public void checkclickoncancelbtn() throws Exception {
		WebElement username=driver.findElement(By.xpath("//*[@id='username']"));
		WebElement mobile=driver.findElement(By.xpath("//*[@id='mobile']"));
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		WebElement course=driver.findElement(By.xpath("//*[@id='course']"));
		WebElement male=driver.findElement(By.xpath("//*[@id='Male']"));
		WebElement female=driver.findElement(By.xpath("//*[@id='Female']"));
		WebElement state=driver.findElement(By.xpath("//select"));
		WebElement password=driver.findElement(By.xpath("//*[@id='password']"));
		WebElement submit=driver.findElement(By.xpath("//*[@id='submit']"));
		String Username=reader.getCellData("Sheet1", "Username", 2);
		System.out.println(Username);
		String Mobile=reader.getCellData("Sheet1", "Mobile", 2);
		System.out.println(Mobile);
		String Email=reader.getCellData("Sheet1", "Email", 2);
		System.out.println(Email);
		String Course=reader.getCellData("Sheet1", "Courses", 2);
		System.out.println(Course);
		String Gender=reader.getCellData("Sheet1", "Gender", 2);
		System.out.println(Gender);
		String State=reader.getCellData("Sheet1", "State", 2);
		System.out.println(State);
		String Password=reader.getCellData("Sheet1", "Password", 2);
		System.out.println(Password);
		
		username.sendKeys(Username);
		mobile.sendKeys(Mobile);
		email.sendKeys(Email);
		course.sendKeys(Course);
		if(Gender.contains("Male")) {
			male.click();
		}else if(Gender.contains("Female")) {
			female.click();
		}
		state.sendKeys(State);
		password.sendKeys(Password);
		submit.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actual=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(actual, "User Added Successfully. You can not see added user.");
		
		Thread.sleep(5000);
		
		WebElement cancelbtn = driver
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/a/span"));
		cancelbtn.click();
       System.out.println("Cancel button is working fine");
		Thread.sleep(5000);

	}

	
	// Check all label 
    @Test()
	public void checkalllabels() throws Exception {
    	WebElement labelSection=	driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]"));
    	List<WebElement> username=labelSection.findElements(By.tagName("label"));
		
		WebElement submit=driver.findElement(By.xpath("//*[@id='submit']"));
		String Username=reader.getCellData("Sheet1", "Username", 2);
		System.out.println(Username);
		String Mobile=reader.getCellData("Sheet1", "Mobile", 2);
		System.out.println(Mobile);
		String Email=reader.getCellData("Sheet1", "Email", 2);
		System.out.println(Email);
		String Course=reader.getCellData("Sheet1", "Courses", 2);
		System.out.println(Course);
		String Gender=reader.getCellData("Sheet1", "Gender", 2);
		System.out.println(Gender);
		String State=reader.getCellData("Sheet1", "State", 2);
		System.out.println(State);
		String Password=reader.getCellData("Sheet1", "Password", 2);
		System.out.println(Password);
		
		username.sendKeys(Username);
		mobile.sendKeys(Mobile);
		email.sendKeys(Email);
		course.sendKeys(Course);
		if(Gender.contains("Male")) {
			male.click();
		}else if(Gender.contains("Female")) {
			female.click();
		}
		state.sendKeys(State);
		password.sendKeys(Password);
		submit.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actual=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(actual, "User Added Successfully. You can not see added user.");
		
					
		Thread.sleep(5000);
	
		String Username1=reader.getCellData("Sheet1", "Username", 1);
		
		String Mobile1=reader.getCellData("Sheet1", "Mobile", 1);
		
		String Email1=reader.getCellData("Sheet1", "Email", 1);
		
		String Course1=reader.getCellData("Sheet1", "Courses", 1);
		
		String Gender1=reader.getCellData("Sheet1", "Gender", 1);
		
		String States=reader.getCellData("Sheet1", "State", 1);
		
		String Passwords=reader.getCellData("Sheet1", "Password", 1);
		
		
		ArrayList<String>actuallabel=new ArrayList();
		actuallabel.add(Username1);
		actuallabel.add(Mobile1);
		actuallabel.add(Email1);
		actuallabel.add(Course1);
		actuallabel.add(Gender1);
		actuallabel.add(States);
		actuallabel.add(Passwords);
		
		WebElement userlabel=driver.findElement(By.xpath("//label[text()='Username']"));
		WebElement mobilelabel=driver.findElement(By.xpath("//label[text()='Mobile']"));
		WebElement emaillabel=driver.findElement(By.xpath("//label[text()='Email']"));
		WebElement courselabel=driver.findElement(By.xpath("//label[text()='Courses']"));
		WebElement genderlabel=driver.findElement(By.xpath("//label[text()='Gender']"));
		WebElement statelabel=driver.findElement(By.xpath("//label[text()='State']"));
		WebElement passwordlabel=driver.findElement(By.xpath("//label[text()='Password']"));
		
		List<String> explabels=new ArrayList();
		explabels.add(userlabel.getText());
		explabels.add(mobilelabel.getText());
		explabels.add(emaillabel.getText());
		explabels.add(courselabel.getText());
		explabels.add(genderlabel.getText());
		explabels.add(statelabel.getText());
		explabels.add(passwordlabel.getText());
		
		Assert.assertEquals(actuallabel, explabels);
		
	}

		
    @DataProvider
	public Object[][] dp() 
	{
		return new Object[][] 
		{
			new Object[] { "Niketa", "9874561238", "niketa@gmail.com", "Selenium", "Female","Maharashtra", "12345" , },
			};
	}
		
	//radio button click at a time
	@Test(dataProvider = "dp" )
	public void CheckGender(String username, String Mobile, String Email, String Courses, String gender, String State, String Password) throws Exception {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys(Mobile);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id='course']")).sendKeys(Courses);
		if(gender.equals("Male"))
		driver.findElement(By.xpath("//*[@id='Male']")).click();
		if(gender.equals("Female"))
		driver.findElement(By.xpath("//*[@id='Female']")).click();
		WebElement state=driver.findElement(By.xpath("//select"));
		Select s = new Select(state);
		s.selectByVisibleText(State);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(Password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String actmsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		System.out.println(actmsg);
		Assert.assertEquals(actmsg, "User Added Successfully. You can not see added user.");
					
		Thread.sleep(5000);

		List<WebElement>radiobtn=driver.findElements(By.xpath("//input[@type='radio']"));
		boolean flag = false;
		for(WebElement gender1:radiobtn) {
			gender1.click();
			flag=gender1.isSelected();
			
		}
		Assert.assertTrue(flag);
		
		System.out.println(1);
		Thread.sleep(5000);

	}

	@AfterMethod
	public void close() {
		driver.quit();
	}
}


