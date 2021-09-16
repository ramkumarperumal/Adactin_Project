package com.adactin.base;

import java.awt.Robot;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Base_Class {
	
	public static WebDriver driver;
	
	
	public static WebDriver browserLaunch(String browser) {
		
		
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\driver\\msedgedriver.exe");
				driver = new EdgeDriver();
				
			}
			else if (browser.equalsIgnoreCase("firedfox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else {
				System.out.println("Invalid Browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void navigate_To(String to_site) {
		
		driver.navigate().to(to_site);

	}

	public static void navigate_Back() {
		driver.navigate().back();
	}
	
	public static void navigate_Forward() {
		driver.navigate().forward();
	}
	
	public static void navigate_Refresh() {
		driver.navigate().refresh();
	}
	
	
	public static void get(String website) {
		driver.get(website);
		
	}
	

	

	public static void alert(String alert) {
		
		try {
			if (alert.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
			}
			else if(alert.equalsIgnoreCase("dismiss")) {
				driver.switchTo().alert().dismiss();
			}
			else if(alert.equalsIgnoreCase("prompt")) {
				Scanner s = new Scanner("System.in");
				System.out.println("Enter the text for prompt alert");
				String text = s.next();
				driver.switchTo().alert().sendKeys(text);
				driver.switchTo().alert().accept();		
				s.close();			
			}
			else {
				System.out.println("Enter a valid alert");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void actions(String action, WebElement element, WebElement element1 ) {
		
		Actions a = new Actions(driver);
		try {
			if (action.equalsIgnoreCase("click")) {
				a.click(element).build().perform();;
			}
			else if(action.equalsIgnoreCase("doubleClick")) {
				a.doubleClick(element).build().perform();;
			}
			else if(action.equalsIgnoreCase("contextClick")) {
				a.contextClick(element).build().perform();;
			}
			else if(action.equalsIgnoreCase("moveToElement")) {
				a.moveToElement(element).build().perform();;
			}
			else if(action.equalsIgnoreCase("dragAndDrop")) {
				a.dragAndDrop(element, element1).build().perform();
			}
			else {
				System.out.println("Invalid Actions");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void frames(String frametype, String frame, WebElement element) {
		
		try {
			if(frametype.equalsIgnoreCase("integer")) {
				int index = Integer.parseInt(frame);
				driver.switchTo().frame(index);
			}
			else if(frametype.equalsIgnoreCase("string")) {
				driver.switchTo().frame(frame);
			}
			else if(frametype.equalsIgnoreCase("webelement")) {
				driver.switchTo().frame(element);
			}
			else {
				System.out.println("Invalid frametype");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void robot(String string, int key) throws Throwable {
		
		Robot r = new Robot();
		
				
		if(string.equalsIgnoreCase("press")) {
			r.keyPress(key);
		 }
		else if(string.equalsIgnoreCase("release")) {
			
			r.keyRelease(key);
		}
	}	
	
	
	
	 public static void windowHandles(String windowtitle) {
		 
		 Set<String> windows = driver.getWindowHandles();
		 for (String string : windows) {
			 
			 try {
				if(windowtitle.equalsIgnoreCase(string)) {
					 driver.switchTo().window(string);
				 }
				 else {
					 System.out.println("Invalid window title");
				 }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		}
	 
	 public static void dropDown(WebElement element, String option, String value) {
		 
		 Select s = new Select(element);
		 
		 try {
			if (option.equalsIgnoreCase("byIndex")) {
				 int value1 = Integer.parseInt(value);
				 s.selectByIndex(value1);
			 }
			 else if(option.equalsIgnoreCase("byValue")) {
				 s.selectByValue(value);
			 }
			 else if(option.equalsIgnoreCase("byVisibleText")) {
				 s.selectByVisibleText(value);
			 }
			 else {
				 System.out.println("Invalid dropdown option");
			 }
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	 public static void checkBox(WebElement element) {
		 element.click();
	}
	 
	 public static void isEnabled(WebElement element) {
		 
		 boolean enabled = element.isEnabled();
		 System.out.println(enabled);

	}
	 
	 public static void isDisplayed(WebElement element) {
		
		 boolean displayed = element.isDisplayed();
		 System.out.println(displayed);

	}
	 
	 public static void isSelected(WebElement element) {
		 
		 boolean displayed = element.isDisplayed();
		 System.out.println(displayed);

	}
		
	 public static void getTitle() {
		 
		 System.out.println(driver.getTitle());

	}
	 
	 public static void getCurrentUrl() {
	
		 System.out.println(driver.getCurrentUrl());
		 
	}
	 
	 public static void getText(WebElement element) {
		 
		 System.out.println(element.getText());
		 //String text = element.getText();
		 //return text;

	}
	 
	 public static void getAttributeValue(WebElement element) {
		 System.out.println(element.getAttribute("value"));
	 }
	 
	 public static void getAttributeName(WebElement element, String attributename) {
		 
		 String attribute = element.getAttribute(attributename);
		 System.out.println(attribute);
		// return attribute;
		 
	 }
	 
	 public static void wait(String type, long time,TimeUnit t, WebElement element) {
		 
		 if(type.equalsIgnoreCase("Implicit")) {
			 driver.manage().timeouts().implicitlyWait(time, t);
		 }
		 else if(type.equalsIgnoreCase("Explicit")) {
			 WebDriverWait wait = new WebDriverWait(driver, time);
			 wait.until(ExpectedConditions.visibilityOf(element));
		 }
//		 else if(type.equalsIgnoreCase("fluent")) {
//			 
//			 Wait wait = new FluentWait(driver)
//			 .withTimeout(time, TimeUnit.SECONDS)
//			 .pollingEvery(time1, TimeUnit.SECONDS)
//			 .ignoring(Exception.class);
//			 
//		}
		 
	}
	 
	 public static void takeScreenShot(String filepath) throws Throwable {
		 
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dst = new File(filepath);
		 FileUtils.copyFile(src, dst);
		 
	 }
	 
	 public static void scrollUpDown(String scroll, WebElement element, String x, String y) {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 try {
			if(scroll.equalsIgnoreCase("byElement")) {
				 js.executeScript("arguments[0].scrollIntoView();", element);
			 }
			 else if(scroll.equalsIgnoreCase("byPixels")) {
				 js.executeScript("window.scrollBy("+x+","+y+");");
			 }
			 else {
				 System.out.println("Invalid options");
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	 
	 
	 public static void sendKeys(WebElement element, String value) {
		 
		 element.sendKeys(value);
		 
	}
	 
	 public static void getFirstSelected(WebElement element) {
		 
		 Select s = new Select(element);
		 WebElement firstSelectedOption = s.getFirstSelectedOption();
		 System.out.println(firstSelectedOption);

	}
	 
	 public static void getAllSelected(WebElement element) {
		 
		 Select s= new Select(element);
		 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		 System.out.println(allSelectedOptions);
	}
	 
	 public static void isMultiple(WebElement element) {

		 Select s = new Select(element);
		 boolean multiple = s.isMultiple();
		 System.out.println(multiple);

	}
	 
	 public static void click(WebElement element) {
		 
		 element.click();
		 
	 }
	 
	 public static void clear(WebElement element) {
		 
		 element.clear();

	}
}
