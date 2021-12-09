package com.Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.util.BaseClass;

public class SearchResult  extends BaseClass {

	public static void searchResult(){
		Reporter.log("Search Result started..");
		WebElement search=driver.findElement(By.linkText(SearchResultElements.search_result_linktext));
		search.click();
		Reporter.log("Search Result Ended..");
	}
}
