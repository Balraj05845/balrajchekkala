package com.vtiger.genericUtilities;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;

import com.swaglabs.pomclasses.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {
		public propertyfileUtiity ab = new propertyfileUtiity();
		public ExcelFileUtility cd = new ExcelFileUtility();
		public WebDriverUtility ef = new WebDriverUtility();
		public javaUtility gh = new javaUtility();
		public WebDriver wd=null;
		@BeforeSuite
		public void beforeSuiteConfig() {
			System.out.println("======Db Connection==========");
		}
		@AfterSuite
		public void afterSuiteConfig() {
			System.out.println("====Db disconnected========");
		}
		@BeforeClass
		public void beforclassConfig() throws Throwable {
			String Browser=ab.readDataFromPropertyFile("browser");
			String Url=ab.readDataFromPropertyFile("url");
			if(Browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				wd=new EdgeDriver();
				System.out.println("Edge driver is launched");
			}else if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
				wd=new ChromeDriver();
				System.out.println("Chrome Driver is launched");
			}else {
				System.out.println("Invalid broser name");
			}
			wd.get(Url);
			ef.maximizeBrowser(wd);
			ef.waitforPageLoad(wd);
			ef.getScreenshoot(wd, "login3");
		}
		@AfterClass
		
		public void afterClassConfig() {
			wd.quit();
		}
		@BeforeMethod
		public void beforeMethodConfig() throws Throwable {
			String UN=ab.readDataFromPropertyFile("un");
			String PWD=ab.readDataFromPropertyFile("pwd");
			Loginpage Lp=new Loginpage(wd);
			Lp.loginToApp(UN, PWD);
			ef.getScreenshoot(wd, "home3");
		}
		@AfterMethod
		public void afterMethodConfig() {
			System.out.println("log out from appplication");
		}

	}


