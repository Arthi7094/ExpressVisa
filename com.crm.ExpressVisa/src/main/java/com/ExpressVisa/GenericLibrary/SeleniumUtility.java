package com.ExpressVisa.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumUtility {
	
		public void maximize(WebDriver driver) {
			driver.manage().window().maximize();	
		}
		public void implicitwait(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		public void navigatetoapplication(WebDriver driver,String Url) {
			driver.get(Url);
		}
		public void MouserHover(WebDriver driver,WebElement address) {
			Actions a =new Actions(driver);//calling Actions class in order to perform mousehover
			a.moveToElement(address);//but v have to get the address of so v r creating a parametrized constructor and passing the argument as Webelement address
		}
		public void closebrowser(WebDriver driver) {
			driver.quit();
		}
		}


