package com.adactin.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.base.Base_Class;
import com.adactin.property.PageObjectManager;
import com.adactin.runner.AdactinRunner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectHotelStepDefinition extends Base_Class{

	
	public static WebDriver driver = AdactinRunner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	
	@When("^user click the checkbox of hotel$")
	public void user_click_the_checkbox_of_hotel() throws Throwable {
		
		click(pom.getSelectHotel().getRadio_button());
	    
	}

	@When("^user click the continue button$")
	public void user_click_the_continue_button() throws Throwable {
		
		click(pom.getSelectHotel().getContinue_button());
	   
	}

	@Then("^user validate the selection of hotel$")
	public void user_validate_the_selection_of_hotel() throws Throwable {
	  
		String title = driver.getTitle();
		Assert.assertEquals(title, "Adactin.com - Book A Hotel");
	
}
	
}
