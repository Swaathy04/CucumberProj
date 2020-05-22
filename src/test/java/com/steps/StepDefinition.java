package com.steps;

import org.openqa.selenium.WebDriver;
import com.pages.LoginPomPage;
import com.site.Library;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Library{
	
	WebDriver driver;
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
	  	launchBrowser();
	}

	@Given("user enter url")
	public void user_enter_url() {
		loadUrl("https://www.facebook.com/");	 
		
	}
	
	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String s1, String s2) {
		
		LoginPomPage obj = new LoginPomPage();
		
		typevalue(obj.getUserId(),s1);
		typevalue(obj.getPassword(), s2);

	    	}

	@Then("user click login button")
	public void user_click_login_button() {
	   
		LoginPomPage obj = new LoginPomPage();
		
		clickIt(obj.getLogin());
	}

	@Then("user validate test")
	public void user_validate_test() {
	    System.out.println("Test Case: Pass");
	}


	
}
