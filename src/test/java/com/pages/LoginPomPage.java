package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.site.Library;

public class LoginPomPage extends Library {

	public LoginPomPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement UserId;
	
	
	@FindBy(id="pass")
	private WebElement Password;
	
	@FindBy(id="loginbutton")
	private WebElement Login;
	
	public WebElement getUserId() {
		return UserId;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

}
