package com.site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library {
	
	 public static WebDriver driver;
	
	public static WebDriver launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HAI\\eclipse-workspace\\SeleniumWindow\\hearts\\chromedriver.exe");
		
		 return driver = new ChromeDriver();
		
	}
	
	public static void loadUrl(String url) {

		driver.get(url);
	}
	
	public static void typevalue(WebElement ele,String val) {

      ele.sendKeys(val);		
	}

	public static void clickIt(WebElement ele) {
		
		ele.click();
		
	}
}
