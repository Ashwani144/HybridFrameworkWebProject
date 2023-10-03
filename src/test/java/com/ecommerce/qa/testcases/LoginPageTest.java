package com.ecommerce.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.LoginPage;
import com.ecommerce.qa.pages.MyAccountPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		
		initialization();
		 loginPage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title=loginPage.validateLoginPageTitle();
		
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test(priority=2)
	public void AppLogoImageTest(){
		Boolean flag = loginPage.validatelogoImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest(){
		myaccountpage=loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
