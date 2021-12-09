package com.Pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;

import com.util.BaseClass;

public class HomePage extends BaseClass{
	
	public static void launchHomePage() throws IOException {
		
		BaseClass.setupDriver();
		
                      }
	
	public static void searchBoxValues(String searchboxvalue ) {
		Reporter.log("Home Page started..");
		WebElement searchbox =driver.findElement(By.id(HomePageElements.searchboxid));
		WebElement searchbutton =driver.findElement(By.id(HomePageElements.searchbutton));
		searchbox.sendKeys(searchboxvalue);
		searchbutton.click();
		Reporter.log("Home Page Ended..");
	}
	
	
}


