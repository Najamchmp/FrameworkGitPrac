package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import com.Pageobject.HomePageElements;

public class BaseClass {
	
public static String path=System.getProperty("user.dir");
public static WebDriver driver;
public static Properties prop;


public static void setupDriver() throws IOException{
	
	
	prop=new Properties();
	FileInputStream file=new FileInputStream(path + "\\src\\test\\resources\\com\\resource\\config" );
	prop.load(file);
	

	String browser= prop.getProperty("browser");

	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		
		driver=new FirefoxDriver();
	}
	driver.get(HomePageElements.url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
	
	
}

@AfterSuite
public void tearDown() {
	driver.quit();
    }

}
