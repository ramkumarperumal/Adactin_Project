package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

	
	public static Properties p;
	
	public ConfigurationReader() throws Throwable {
		
		File f = new File("C:\\Users\\ramkumar\\eclipse-workspace\\AdactinProject\\src\\test\\java\\com\\adactin\\property\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);		
	}
	
	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		
		String username = p.getProperty("username");
		return username;

	}
	
	public String getPassword() {
		
		String password = p.getProperty("password");
		return password;
	}
	
	public String getFirstName() {
		
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	
	public String getLastName() {
		
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	
	public String getAddress() {
		
		String address = p.getProperty("address");
		return address;
		
	}
	
	public String getCardNumber() {
		
		String cardno = p.getProperty("card_number");
		return cardno;
	}
	
	public String getCVV() {
		
		String cvv = p.getProperty("cvv");
		return cvv;
	}
			
}

