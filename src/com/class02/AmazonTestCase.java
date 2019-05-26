package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestCase {

	public static void main(String[] args) {
	
    System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://google.com");
	driver.navigate().to("http://amazon.com/");
	String title= driver.getTitle();
	    
	    if (title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, "
	    		+ "Computers, Books, DVDs & more")) {
	    	System.out.println("This is the right title");
	    } else {
	    	System.out.println("Sorry this is not right title");
	    }

	}

}
