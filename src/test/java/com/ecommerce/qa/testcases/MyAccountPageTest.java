package com.ecommerce.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.DesktopPage;
import com.ecommerce.qa.pages.LoginPage;
import com.ecommerce.qa.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase {
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	DesktopPage desktopPage;

	public MyAccountPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		loginPage = new LoginPage();
		myaccountpage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void verifyMyAccountPageTitle() {
		String MyAccountPageTitle = myaccountpage.verifyMyAccountTitlePage();
		Assert.assertEquals(MyAccountPageTitle, "My Account", "Account Page Title is not matched");
	}

	@Test(priority = 2)
	public void verifyDeskTopLinkTest() {
		desktopPage = myaccountpage.clickOnDesktopLink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
