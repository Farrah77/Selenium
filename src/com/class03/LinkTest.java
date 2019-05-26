
package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("marioncherry123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("marionberry1111");
		driver.findElement(By.id("loginbutton")).click();
		
		
		
	}
	
	
	
} 