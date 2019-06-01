package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.CommonMethods;

public class HomeworkTask1 extends CommonMethods {

public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome","http://uitestpractice.com/");
		driver.findElement(By.linkText("Form")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("Scarlet");
		driver.findElement(By.id("lastname")).sendKeys("O'Hara");
		WebElement statusButton = driver.findElement(By.name("optradio"));
		if (statusButton.isEnabled()) {
			//Thread.sleep(3000);
			statusButton.click();
		}
		
		WebElement hobbyButton = driver.findElement(By.xpath("//input[@value='dance']"));
		if (hobbyButton.isEnabled()) {
			//Thread.sleep(3000);
			hobbyButton.click();
		}
		
		selectValueFromDD(driver.findElement(By.cssSelector("select#sel1")), "Bahamas");
		driver.findElement(By.cssSelector("input#datepicker")).click();
		selectValueFromDD(driver.findElement(By.cssSelector("select.ui-datepicker-month")), "May");
		selectValueFromDD(driver.findElement(By.cssSelector("select.ui-datepicker-year")), "1990");
		//selectValueFromDD(driver.findElement(By.cssSelector("select.ui-datepicker-year")), "29");
		
		
		driver.findElement(By.id("phonenumber")).sendKeys("123-345-567");
		driver.findElement(By.id("username")).sendKeys("Scar");
		driver.findElement(By.id("email")).sendKeys("scarlet@gmail.com"); 
		WebElement aboutText = driver.findElement(By.id("comment"));
		aboutText.sendKeys("Hello, My name is Scarlet and I am from Tara");
		Thread.sleep(3000);
		String text = aboutText.getText();
		System.out.println(text);
		
		driver.findElement(By.id("pwd")).sendKeys("tara");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		driver.close();
			
		}	

	}


