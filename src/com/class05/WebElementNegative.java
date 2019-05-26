package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementNegative {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard-user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret-sauce");
	    driver.findElement(By.cssSelector("input.btn_action")).click();
		
	    
		WebElement errorTxt = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String value = errorTxt.getText();

		if (value.equals("Epic sadface: Username and password do not match any user in this service")) {
			System.out.println("Negative Test case PASS");
		} else {
			System.out.println("Negative Test case FAIL");
		}

	}
}
