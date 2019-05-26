package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) {
	
        System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://sephora.com");
		driver.close(); //browser completely terminated and it won't open new website
		

	}

}
