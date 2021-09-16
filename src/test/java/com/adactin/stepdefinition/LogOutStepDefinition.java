package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.base.Base_Class;
import com.adactin.property.PageObjectManager;
import com.adactin.runner.AdactinRunner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutStepDefinition extends Base_Class {

	
	public static WebDriver driver = AdactinRunner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@When("^user click the logout button$")
	public void user_click_the_logout_button() throws Throwable {
	    
		
		click(pom.getLogoutPage().getLogout());
		
	}

	@Then("^user validate the logout of application$")
	public void user_validate_the_logout_of_application() throws Throwable {
	   
		
	}

	
}
