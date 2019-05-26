package com.class01;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
	
		
	//System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
	
		//WebDriver driver = new ChromeDriver();
		//driver.get("http:amazon.com");
	
	System.setProperty("webdriver.gecko.driver", "/Users/farrah/Selenium/geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://amazon.com");
			
			
	}

}
