package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().fullscreen();
	
	    //Simple Alert 
		driver.findElement(By.cssSelector("button[class*='btn btn-default']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println("The text of simple alert is "+simpleAlert.getText());
		simpleAlert.accept();
		
		//Confirm Alert
		driver.findElement(By.cssSelector("button[class*='btn btn-default btn-lg']")).click();
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println("The text of confirmation alert is "+confirmAlert.getText());
		confirmAlert.accept();
		
		//Prompt Alert
		driver.findElement(By.className("btn btn-default btn-lg")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("The text of prompt alert is "+promptAlert.getText());
		promptAlert.accept();
		
		
		
		driver.quit();
	}

}
