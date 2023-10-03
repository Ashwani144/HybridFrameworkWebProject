package com.ecommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory : OR

	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement password;

	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement signupBtn;

	@FindBy(xpath="//div[@id='logo']")
	WebElement AppLogo;
	
	//Initialization the Page Object :
	
	public LoginPage(){
		PageFactory.initElements(driver,this);
	}
	
	// Actions  ---------------------------------
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public Boolean validatelogoImage(){
		return AppLogo.isDisplayed();
	}
	
	public MyAccountPage login(String em, String pwd){
		email.sendKeys(em);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new MyAccountPage();
	}
}
