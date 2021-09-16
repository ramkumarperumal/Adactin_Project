package com.adactin.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.BookHotel;
import com.adactin.pom.ConfirmBooking;
import com.adactin.pom.LoginPage;
import com.adactin.pom.LogoutPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	
	public static WebDriver driver;
	private LoginPage lp;
	private SearchHotel sh;
	private SelectHotel ssh;
	private BookHotel bh;
	private ConfirmBooking cb;
	private LogoutPage lo;
	
	
	public PageObjectManager(WebDriver driver2) {
		
		this.driver=driver2;
		//PageFactory.initElements(driver, this);
	}
	
	public LoginPage getLoginPage() {
		
		lp = new LoginPage(driver);
		return lp;
		
	}
	
	public SearchHotel getSearchHotel() {
		
		sh = new SearchHotel(driver);
		return sh;
	}
	
	public SelectHotel getSelectHotel() {
		
		ssh = new SelectHotel(driver);
		return ssh;
	}
	
	public BookHotel getBookHotel() {
		
		bh = new BookHotel(driver);
		return bh;
	}
	
	public ConfirmBooking getConfirmBooking() {
		
		cb = new ConfirmBooking(driver);
		return cb;
	}
	
	public LogoutPage getLogoutPage() {
		
		lo = new LogoutPage(driver);
		return lo;
	}
}
