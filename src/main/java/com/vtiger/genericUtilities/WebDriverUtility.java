package com.vtiger.genericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
public class WebDriverUtility  {

	public void maximizeBrowser(WebDriver wd) {
		wd.manage().window().maximize();
	}
	public void minimizeBrowser(WebDriver wd) {
		wd.manage().window().minimize();
	}
	public void waitforPageLoad(WebDriver wd) {
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}//method overloading
	public void handleDropDown(WebElement ele,int index) {
		Select s=new Select(ele);
		s.selectByIndex(index);
	}
	public void handleDropDown(WebElement ele,String value) {
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	public void handleDropDown(String visibleText,WebElement ele) {
		Select s=new Select(ele);
		s.selectByVisibleText(visibleText);
	}
	public void mouceOverActiobns(WebDriver wd,WebElement ele) {
		Actions a=new Actions(wd);
		a.moveToElement(ele).perform();
	}
	public void rightClick(WebDriver wd,WebElement ele) {
		Actions a=new Actions(wd);
		a.contextClick(ele).perform();
	}
	public void doubleClick(WebDriver wd,WebElement ele) {
		Actions a=new Actions(wd);
		a.doubleClick(ele).perform();
	}
	public void dragAndDrop(WebDriver wd,WebElement ele1,WebElement ele2) {
		Actions a=new Actions(wd);
		a.dragAndDrop(ele1,ele2).perform();
	}
	public void getScreenshoot(WebDriver wd,String scrname) {
		TakesScreenshot ts=(TakesScreenshot)wd;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\DELL 5290\\eclipse-workspace\\hybrid\\SCREENSHOTS"+scrname+".png");
	try {
		Files.copy(src, des);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
