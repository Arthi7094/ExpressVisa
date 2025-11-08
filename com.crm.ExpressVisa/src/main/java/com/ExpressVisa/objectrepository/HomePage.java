package com.ExpressVisa.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//declaration
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement getlogouticon;
	@FindBy(linkText = "Sign Out")
	private WebElement clicksignout;
	//initialization
	public HomePage(WebDriver driver) {//creating constructor
	PageFactory.initElements(driver,this);
	
}
	public WebElement getGetlogouticon() {
		return getlogouticon;
	}
	public void setGetlogouticon(WebElement getlogouticon) {
		this.getlogouticon = getlogouticon;
	}
	public WebElement getClicksignout() {
		return clicksignout;
	}
	public void setClicksignout(WebElement clicksignout) {
		this.clicksignout = clicksignout;
	}
	
}