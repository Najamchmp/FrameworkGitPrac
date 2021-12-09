package com.testcase;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Pageobject.HomePage;
import com.Pageobject.OrderPage;
import com.Pageobject.SearchResult;
import com.util.BaseClass;

public class TestCases extends BaseClass{

	
	
	@Test(priority=0)
	public void homePageTesting() throws IOException {
		HomePage.launchHomePage();
		HomePage.searchBoxValues("mobile");
	}
	
	@Test(priority=1)
	public void searchResult(){
		SearchResult.searchResult();
	}
	
	
	@Test(priority=2)
	public void order(){
		OrderPage.orderPage();
	}
	
	
}


