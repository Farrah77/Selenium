package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("http://newtours.demoaut.com/");
	//Relative X Path
	driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Elizabeth");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Benneth");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("+110220330");
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("marioncherry123@gmail.com");
	
	//Contains X Path
	driver.findElement(By.xpath("//input[contains(@name,'address1')]")).sendKeys("Benneth House");
	driver.findElement(By.xpath("//input[contains(@name,'address2')]")).sendKeys("Benneth House");
	driver.findElement(By.xpath("//input[contains(@name,'city')]")).sendKeys("Hartfordshird");
	driver.findElement(By.xpath("//input[contains(@name,'state')]")).sendKeys("York");
	driver.findElement(By.xpath("//input[contains(@name,'postalCode')]")).sendKeys("112233");
	//driver.findElement(By.xpath("//input[@name='country']")).sendKeys("USA");
	
	//Starts With X Path 
	driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).sendKeys("marioncherry123@gmail.com");
	driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("marionberry111");
	driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]")).sendKeys("marionberry111");
	driver.findElement(By.xpath("//input[starts-with(@name,'regis')]")).click();
	driver.quit();

	}

}
