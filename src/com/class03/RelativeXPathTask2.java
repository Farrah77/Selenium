package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPathTask2 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Elizabeth");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Benneth");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("+110220330");
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("marioncherry123@gmail.com");
	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Benneth House");
	driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Benneth House");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Hartfordshird");
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys("York");
	driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("112233");
	//driver.findElement(By.xpath("//input[@name='country']")).sendKeys("USA");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("marioncherry123@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("marionberry111");
	driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("marionberry111");
	driver.findElement(By.xpath("//input[@name='register']")).click();
	driver.quit();

	}

}
