package com.ecommerce.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.DesktopPage;
import com.ecommerce.qa.pages.LoginPage;
import com.ecommerce.qa.pages.MyAccountPage;

public class DesktopPageTest extends TestBase {
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	DesktopPage desktopPage;
	
	public DesktopPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		 initialization();
		 desktopPage=new DesktopPage();
		 loginPage=new LoginPage();
		 myaccountpage=loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
  /* @Test
   public void clickOnMacOption(){
	   desktopPage.clickonDesktopLinkofMacoption();
   }*/
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
