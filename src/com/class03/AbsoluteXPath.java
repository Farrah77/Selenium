package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/User/farrah/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

driver.get("https://www.saucedemo.com");
driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='text']")).sendKeys("standard_user");
driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@id='password']")).sendKeys("secret_sauce");
driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@value='LOGIN']")).click();
	
	}

}
