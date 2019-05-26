package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class IFrame  extends CommonMethods {

	public static void main(String[] args) {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		// Way 1
		//driver.switchTo().frame("iframe_a");
		//driver.findElement(By.cssSelector("input#name")).sendKeys("John");
		//driver.switchTo().defaultContent();
		
		//Way 2
		//WebElement elem = driver.findElement(By.xpath("iframe[@name='iframe_a']"));
		//driver.switchTo().frame(elem);
		//driver.findElement(By.cssSelector("input#name")).sendKeys("John");
		//driver.switchTo().defaultContent();
		
		//Way 3
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input#name")).sendKeys("John");
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
