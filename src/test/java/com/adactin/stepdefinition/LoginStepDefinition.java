package com.adactin.stepdefinition;



import org.openqa.selenium.WebDriver;

import com.adactin.base.Base_Class;
import com.adactin.property.PageObjectManager;
import com.adactin.runner.AdactinRunner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition extends Base_Class{
	
	//public static String img_name;
	
	public static WebDriver driver = AdactinRunner.driver;
	

	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Before
	public  void beforeHooks(Scenario scenario) {

		//String time = java.time.LocalTime.now().toString().split(".")[0];

	    Status status = scenario.getStatus();
		System.out.println(status);
		
		
	}
	
	
	@After
	public void afterHooks(Scenario scenario) throws Throwable {
		
		String name = scenario.getName();	
		if (scenario.isFailed()) {
			
			
			takeScreenShot("C:\\Users\\ramkumar\\eclipse-workspace\\AdactinProject\\screenshot\\"+name+".png");
		}
		
		//System.out.println("scenario passed");
	}
	
	
	
	@Given("^user launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
	   
		
		
		get("https://adactinhotelapp.com/");
		
	}

	@When("^user enter the \"([^\"]*)\" valid username$")
	public void user_enter_the_valid_username(String arg1) throws Throwable {
		
		//img_name = new Throwable().getStackTrace()[0].getMethodName();
		
		//System.out.println("method name:" +img_name);
		
		sendKeys(pom.getLoginPage().getUsername(), arg1);
	 
	}

	@When("^user enter the \"([^\"]*)\" valid password$")
	public void user_enter_the_valid_password(String arg1) throws Throwable {
		
		
		
		sendKeys(pom.getLoginPage().getPassword(), arg1);
	    
	}

	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
		
		
		
		click(pom.getLoginPage().getLogin());
	    
	}

	@Then("^user validate the username and password$")
	public void user_validate_the_username_and_password() throws Throwable {
	    
		//Assert.assertEquals("abd","abcd");
	}



}
