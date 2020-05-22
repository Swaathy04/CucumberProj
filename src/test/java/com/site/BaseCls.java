package com.site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCls {

	public static WebDriver driver;
	
	public static WebDriver launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HAI\\eclipse-workspace\\SeleniumWindow\\hearts\\chromedriver.exe");
		return driver= new ChromeDriver();
		
	}
	
	public static void loadurl(String url) {
		
		driver.get(url);
		
	}
	
	public static void typevalue(WebElement element,String value) {
		
		element.sendKeys(value);

	}
	
	
	
}
