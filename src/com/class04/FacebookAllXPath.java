package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAllXPath {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		//Relative X Path
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("marioncherry123@gmail.com");
		
		//Contains X Path
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("marionberry1111");
		
		//Starts With X Path
		driver.findElement(By.xpath("//input[starts-with(@type,'subm')]")).click();
		

	}

}
