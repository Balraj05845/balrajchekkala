package com.swaglabs.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericUtilities.BaseClass;
import com.vtiger.genericUtilities.WebDriverUtility;

import net.bytebuddy.asm.Advice.This;

public class Homepage extends BaseClass {
//Declararion
	@FindBy(xpath = "//div[.='Sauce Labs Backpack']")private WebElement e1;
	@FindBy(xpath = "//div[.='Sauce Labs Bike Light']")private WebElement e2;
	@FindBy(xpath = "//div[.='Sauce Labs Bolt T-Shirt']")private WebElement e3;
	@FindBy(xpath = "//div[.='Sauce Labs Fleece Jacket']")private WebElement e4;
	@FindBy(xpath = "//div[.='Sauce Labs Onesie']")private WebElement e5;
	@FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")private WebElement e6;
	//intilization
	public Homepage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters
	public WebElement getE1() {
		return e1;
	}
	public WebElement getE2() {
		return e2;
	}
	public WebElement getE3() {
		return e3;
	}
	public WebElement getE4() {
		return e4;
	}
	public WebElement getE5() {
		return e5;
	}
	public WebElement getE6() {
		return e6;
	}
	public void Homepage() {
		e1.click();
		e2.click();
		e3.click();
		e4.click();
		e5.click();
		e6.click();
	}
}

