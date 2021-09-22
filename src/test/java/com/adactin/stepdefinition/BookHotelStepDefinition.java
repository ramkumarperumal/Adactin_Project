package com.adactin.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.base.Base_Class;
import com.adactin.property.FileReaderManager;
import com.adactin.property.PageObjectManager;
import com.adactin.runner.AdactinRunner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookHotelStepDefinition extends Base_Class {

	
	public static WebDriver driver = AdactinRunner.driver;


	PageObjectManager pom = new PageObjectManager(driver);
	
	
	@When("^user enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
		
		sendKeys(pom.getBookHotel().getFirst_name(), FileReaderManager.getInstanceFRM().getInstanceCR().getFirstName());
	   
	}

	@When("^user enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
		
		sendKeys(pom.getBookHotel().getLast_name(), FileReaderManager.getInstanceFRM().getInstanceCR().getLastName());
	  
	}

	@When("^user enter the billing address$")
	public void user_enter_the_billing_address() throws Throwable {
		
		sendKeys(pom.getBookHotel().getAddress(), FileReaderManager.getInstanceFRM().getInstanceCR().getAddress());
	   
	}

	@When("^user enter the credit card number$")
	public void user_enter_the_credit_card_number() throws Throwable {
	    
		sendKeys(pom.getBookHotel().getCc_number(), FileReaderManager.getInstanceFRM().getInstanceCR().getCardNumber());
	}

	@When("^user enter the credit card type$")
	public void user_enter_the_credit_card_type() throws Throwable {
		
		dropDown(pom.getBookHotel().getCard_type(), "byValue", "VISA");
	    
	}

	@When("^user enter the credit card expiry month$")
	public void user_enter_the_credit_card_expiry_month() throws Throwable {
	  
		dropDown(pom.getBookHotel().getExp_month(), "byVisibleText", "July");
	}

	@When("^user enter the credit card expiry year$")
	public void user_enter_the_credit_card_expiry_year() throws Throwable {
	   
		dropDown(pom.getBookHotel().getExp_year(), "byValue", "2022");
	}

	@When("^user enter the credit card cvv number$")
	public void user_enter_the_credit_card_cvv_number() throws Throwable {
		
		sendKeys(pom.getBookHotel().getCvv(), FileReaderManager.getInstanceFRM().getInstanceCR().getCVV());
	   
	}

	@When("^user click the booknow button$")
	public void user_click_the_booknow_button() throws Throwable {
		
		click(pom.getBookHotel().getBook_button());
	    
	}

	@Then("^user validate the booking of hotel$")
	public void user_validate_the_booking_of_hotel() throws Throwable {

	}
}
