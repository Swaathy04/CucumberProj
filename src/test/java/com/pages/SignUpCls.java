package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.site.Library;

public class SignUpCls extends Library {
	
	public SignUpCls() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="u_0_m")
	private WebElement firstname;
	
	@FindBy(id="u_0_o")
	private WebElement surname;

	@FindBy(name="reg_email__")
	private WebElement mobilenum;
	
	@FindBy(name="reg_passwd__")
	private WebElement newpass;
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSurname() {
		return surname;
	}

	public WebElement getMobilenum() {
		return mobilenum;
	}

	public WebElement getNewpass() {
		return newpass;
	}

	
		}
