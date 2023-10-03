package com.ecommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.qa.base.TestBase;

public class DesktopPage extends TestBase {

	@FindBy(xpath="//a[text()='Mac (1)']")
	WebElement MacLink;
	
	@FindBy(xpath="//h2[text()='Mac']")
	WebElement macLabel;
	
	@FindBy(xpath="//a[text()='Desktops']")
	WebElement desktopLink;
	
	public void DesktopPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickonDesktopLinkofMacoption(){
		Actions act=new Actions(driver);
		act.moveToElement(desktopLink).build().perform();
		MacLink.click();
	}
	
	
}
