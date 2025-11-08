package com.ExpressVisa.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ExpressVisa.objectrepository.HomePage;
import com.ExpressVisa.objectrepository.LoginPage;

public class BaseClass {
		public static WebDriver driver;
		 FileUtilization f=new FileUtilization();
		 SeleniumUtility sutil=new SeleniumUtility();
		 @BeforeSuite
		 public void Browserlaunched() {
			 Reporter.log("browser launched",true);
		 }
		 //@Parameters("browser")//TO TELL WHICH BROWSER TO OPEN V USE THIS
 @BeforeTest
 public void launchbrowser(@Optional("chrome") String BROWSER) throws IOException {
	 if(BROWSER.equals("chrome")){
		 driver=new ChromeDriver();
	 }
	 else if (BROWSER.equals("firefox")) {
	 driver=new FirefoxDriver();	
	}
	 else if (BROWSER.equals("edge"))
	 driver=new EdgeDriver();
	 
	 else {
		driver=new ChromeDriver();
	}
	 //SeleniumUtility sutil=new SeleniumUtility();made it as global variable
	 sutil.maximize(driver);
	 sutil.implicitwait(driver);
	// FileUtilization f=new FileUtilization();it is made as global soo v can avoid this
	 String URL = f. readdatafromproperty("url");
	 sutil.navigatetoapplication(driver, URL);
	 Reporter.log("browser launched",true);
 }
 @BeforeMethod
 public void login() throws IOException {
	 String un=f.readdatafromproperty("username");
	 String pw=f.readdatafromproperty("password");
	 LoginPage page=new LoginPage(driver);
	 page.login(driver, un, pw);
	 Reporter.log("loggined successfully",true);
	 
 }
 @AfterMethod
 public void logout() {
	 HomePage page=new HomePage(driver);
	 WebElement element = page.getGetlogouticon();//performing mousehover action v r getting the control an stroing it in one variable
 sutil.MouserHover(driver, element);//calling mousehover method and passing webdriver and refernce variable of the mouse hover control
 
 page.getClicksignout();
 Reporter.log("loggedout succesfully",true);
 }
 @AfterTest
 public void closebrowser() {
	 sutil.closebrowser(driver);
	 Reporter.log("browser closed",true);
 }
 @AfterSuite
 public void disconnect() {
	 Reporter.log("disconnected successfully",true);
 }
}
