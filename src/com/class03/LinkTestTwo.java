package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestTwo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Farrah");
		driver.findElement(By.name("lastName")).sendKeys("Dieva");
		driver.findElement(By.name("phone")).sendKeys("+110220330");
		driver.findElement(By.id("userName")).sendKeys("marioncherry123@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("1000 Sunset Blvd");
		driver.findElement(By.name("address2")).sendKeys("1002 Sunrise Blvd");
		driver.findElement(By.name("city")).sendKeys("Beverly Hills");
		driver.findElement(By.name("state")).sendKeys("California");
		driver.findElement(By.name("postalCode")).sendKeys("98777");
		driver.findElement(By.name("country")).sendKeys("USA");
		driver.findElement(By.name("email")).sendKeys("marioncherry123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("marionberry111");
		driver.findElement(By.name("confirmPassword")).sendKeys("marionberry111");
		driver.findElement(By.name("register")).click();
		

	}

}
