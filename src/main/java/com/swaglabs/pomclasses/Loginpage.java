package com.swaglabs.pomclasses;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericUtilities.BaseClass;
import com.vtiger.genericUtilities.WebDriverUtility;

public class Loginpage extends BaseClass {
//Declaration
	@FindBy(xpath ="//input[@id='user-name']" )private WebElement untxt;
	@FindBy(xpath = "//input[@id='password']")private WebElement pwdtxt;
	@FindBy(xpath = "//input[@type='submit']")private WebElement loginBtn;
	//Intialization
	public Loginpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	//getters
	public WebElement getUntxt() {
		return untxt;
	}
	public WebElement getPwdtxt() {
		return pwdtxt;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	//Business Library
	public void loginToApp(String un,String pwd) {
		untxt.sendKeys(un);
		pwdtxt.sendKeys(pwd);
		loginBtn.click();
	}
}
