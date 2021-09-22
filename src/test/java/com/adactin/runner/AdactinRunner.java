package com.adactin.runner;




import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.base.Base_Class;
import com.adactin.property.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src\\test\\java\\com\\adactin\\feature\\Adactin.feature","src\\test\\java\\com\\adactin\\feature\\Adactin2.feature"},
				//features = "@target\\failedrun.txt"	,
				glue = "com\\adactin\\stepdefinition", monochrome = true,
				plugin = {"pretty",
						  //"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html",
						   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						   //"rerun:target\\failedrun.txt"
						 //  "json:target/jsonreport.json",
						//   "html:target/htmlreport"
						  })

public class AdactinRunner {

	
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() throws Throwable {
		
		
		String browse = FileReaderManager.getInstanceFRM().getInstanceCR().getBrowser();
		
		driver = Base_Class.browserLaunch(browse);
		Base_Class.wait("implicit", 10, TimeUnit.SECONDS, null);
		
		
		
	}
	
	
	
	@AfterClass
	public static void closeBrowser() {

		Base_Class.quit();

	}

	
	
}
