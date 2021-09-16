package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement loaction;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement no_of_room;
	
	@FindBy(id = "datepick_in")
	private WebElement checkin;
	
	@FindBy(id = "datepick_out")
	private WebElement checkout;
	
	@FindBy(id = "adult_room")
	private WebElement adult_room;
	
	@FindBy(id = "child_room")
	private WebElement child_room;
	
	@FindBy(id = "Submit")
	private WebElement search;

	public SearchHotel(WebDriver driver2) {
	
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoaction() {
		return loaction;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNo_of_room() {
		return no_of_room;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSearch() {
		return search;
	}
	       

}
