package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
	driver.findElement(By.className("btn_action")). click();
	driver.close();
	
	
	}

}
