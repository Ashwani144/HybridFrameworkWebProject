package com.ecommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.qa.base.TestBase;

public class MyAccountPage extends TestBase {

	@FindBy(xpath="//a[text()='Desktops']")
	WebElement desktopLink;
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	WebElement laptopAndNotebooksLink;
	
	@FindBy(xpath="//a[text()='Components']")
	WebElement componentLink;
	
	@FindBy(xpath="//a[text()='Tablets']")
	WebElement tabletsLink;
	
	public MyAccountPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyMyAccountTitlePage(){
		return driver.getTitle();
	}
	
	public DesktopPage clickOnDesktopLink(){
		desktopLink.click();
		return new DesktopPage();
	}

	
	public LaptopAndNotebookPage clickOnLaptopAndNotebookLink(){
		laptopAndNotebooksLink.click();
		return new LaptopAndNotebookPage();
	}
	
}
