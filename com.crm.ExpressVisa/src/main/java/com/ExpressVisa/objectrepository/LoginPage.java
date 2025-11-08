package com.ExpressVisa.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//declaration
	@FindBy(name = "user_name")
	private  WebElement    untbx;
	@FindBy(name = "user_password")
	private  WebElement    pwtbx;
	@FindBy(id = "submitButton")
	private  WebElement    lgbtn;
	//initization
	public LoginPage(WebDriver driver) {//creating constructor
		PageFactory .initElements(driver, this);
	}
	//utilization
	public WebElement getUntbx() {
		return untbx;
	}
	public WebElement getPwtbx() {
		return pwtbx;
	}
	public WebElement getLgbtn() {
		return lgbtn;
	}
	//Business login
	public void login(WebDriver driver,String username,String password) {
		LoginPage lp=new LoginPage(driver);
		lp.getUntbx().sendKeys(username);
		lp.getPwtbx().sendKeys(password);
		lp.getLgbtn().click();	
	}
}
