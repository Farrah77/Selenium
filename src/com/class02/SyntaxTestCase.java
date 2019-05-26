package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxTestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://syntaxtechs.com/");
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		
		String url= driver.getCurrentUrl();
		    
		    if (url.contains("syntax")) {
		    	System.out.println("This is the right url");
		    } else {
		    	System.out.println("Sorry this is not right title");
		    }	

	}

}
