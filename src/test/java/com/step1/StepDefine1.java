package com.step1;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;


import com.site.Library;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine1 extends Library{

	WebDriver driver;
	
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
	  	launchBrowser();
	}

	@Given("user enter url")
	public void user_enter_url() {
		loadUrl("https://www.facebook.com/");	 
		
	}

	@When("user enter valid details")
	public void user_enter_valid_details(io.cucumber.datatable.DataTable twodmap) {
		
	List<Map<String, String>> mp = twodmap.asMaps();
	
	StepDefine1 obj = new StepDefine1();
	
	
	  
	}

	@Then("user valid the test case")
	public void user_valid_the_test_case() {
		System.out.println("Test Case: Pass");
	   	}


}
