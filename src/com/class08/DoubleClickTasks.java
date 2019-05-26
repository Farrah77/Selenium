package com.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class DoubleClickTasks extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
	setUpDriver("chrome", "http://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions act = new Actions(driver);
	
	act.doubleClick(doubleClick).perform();
	Thread.sleep(2000);
	
	Alert simpleAlert = driver.switchTo().alert();
	simpleAlert.accept();
	driver.close();
	}

}
