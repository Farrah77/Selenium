package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;



public class RightClick extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUpDriver("chrome","https://www.saucedemo.com" );
		WebElement rightClick= driver.findElement(By.cssSelector("input#user-name"));
		Actions action = new Actions(driver);
		action.contextClick(rightClick).perform();
		Thread.sleep(2000);
		driver.close();
		

	}
}