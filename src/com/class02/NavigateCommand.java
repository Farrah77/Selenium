package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.navigate().to("http://walmart.com");
	    Thread.sleep(1000); //helps to see what is actually happening but slows down
	    driver.navigate().to("http://gogle.com");
	    Thread.sleep(1000);
	    driver.navigate().back();
	    Thread.sleep(1000);
	    driver.navigate().forward();
	    Thread.sleep(1000);
	    driver.navigate().refresh();
	    driver.close();
	    
	}

}
