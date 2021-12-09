package com.Pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.util.BaseClass;

public class OrderPage extends BaseClass {
	
	public static void orderPage()  {
		Set<String> windowhandle=driver.getWindowHandles();
		Iterator<String> itr=windowhandle.iterator();
		String parent=itr.next();
		String child=itr.next();
		
		Reporter.log("Order Page started..");
		
		driver.switchTo().window(child);
		System.out.print("child");
		WebElement order=driver.findElement(By.id(OrderPageElements.order_item_add_to_cart_id));
		order.click();
		Reporter.log("Order Page Ended..");

	}

}
