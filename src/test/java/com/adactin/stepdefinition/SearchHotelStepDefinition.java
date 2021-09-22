package com.adactin.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.base.Base_Class;
import com.adactin.property.PageObjectManager;
import com.adactin.runner.AdactinRunner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHotelStepDefinition extends Base_Class{
	
	
	public static WebDriver driver = AdactinRunner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@When("^user select the location$")
	public void user_select_the_location() throws Throwable {
		
		
		dropDown(pom.getSearchHotel().getLoaction(), "byValue", "Brisbane");
	
	    
	}

	@When("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		
		dropDown(pom.getSearchHotel().getHotel(), "byIndex", "3");
	}

	@When("^user select room type$")
	public void user_select_room_type() throws Throwable {
	   
		
		dropDown(pom.getSearchHotel().getRoomtype(), "byVisibleText", "Double");
	}

	@When("^user select number of rooms$")
	public void user_select_number_of_rooms() throws Throwable {
		
		
		dropDown(pom.getSearchHotel().getNo_of_room(), "byIndex", "4");
	   
	}

	@When("^user enter the checkin date$")
	public void user_enter_the_checkin_date() throws Throwable {
	    
		
		clear(pom.getSearchHotel().getCheckin());
		sendKeys(pom.getSearchHotel().getCheckin(), "24/06/2021");
	}

	@When("^user enter the checkout date$")
	public void user_enter_the_checkout_date() throws Throwable {
		
		
		clear(pom.getSearchHotel().getCheckout());
		sendKeys(pom.getSearchHotel().getCheckout(), "26/06/2021");
	}

	@When("^user select number of rooms for adult$")
	public void user_select_number_of_rooms_for_adult() throws Throwable {
	    
		
		dropDown(pom.getSearchHotel().getAdult_room(), "byVisibleText", "2 - Two");
	}

	@When("^user select number of rooms for child$")
	public void user_select_number_of_rooms_for_child() throws Throwable {
		
		
		dropDown(pom.getSearchHotel().getChild_room(), "byVisibleText", "2 - Two");
	    
	}

	@When("^user click the search button$")
	public void user_click_the_search_button() throws Throwable {
	    
		
		click(pom.getSearchHotel().getSearch());
	}

	@Then("^user validate the search of hotel$")
	public void user_validate_the_search_of_hotel() throws Throwable {
	   
		String title = driver.getTitle();
		Assert.assertEquals(title, "Adactin.com - Select Hotel");
	}

}
