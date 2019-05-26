package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class RightClickTask extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
	setUpDriver("chrome", "https://www.saucedemo.com");
	
	WebElement rigthClick = driver.findElement(By.cssSelector("input#password"));

	Actions action = new Actions(driver);
	action.contextClick(rigthClick).perform();
	Thread.sleep(2000);
	driver.close();
	
	}

}
