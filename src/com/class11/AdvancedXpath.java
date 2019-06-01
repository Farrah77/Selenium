package com.class11;

import org.openqa.selenium.By;

import util.CommonMethods;

public class AdvancedXpath extends CommonMethods {

	public static void main(String[] args) {
		

		setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
		
		
		//Parent --> Child 
		driver.findElement(By.xpath("//div[@id='divLoginButton']//input"));
		
		//Child --> Parent
		driver.findElement(By.xpath("//input[@name='Submit']/.."));
		
		//Preceding Sibling
		driver.findElement(By.xpath("//input[@name='hdnUserTimeZoneOffset']/preceding-sibling::input"));
		
		//Following Sibling
		driver.findElement(By.xpath("//input[@name='hdnUserTimeZoneOffset']/following-sibling::input"));
				

	}

}
