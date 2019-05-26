package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class TaskTwo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
	setUpDriver("chrome","http://demo.guru99.com/test/simple_context_menu.html");
	WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions act = new Actions(driver);
	
	act.contextClick(rightClick).perform();
	Thread.sleep(2000);
	driver.close();
	

	}

}
