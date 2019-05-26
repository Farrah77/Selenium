package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.CommonMethods;

public class TaskTwo extends CommonMethods {

	public static void main(String[] args) {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		if (checkBox.isEnabled()) {
			checkBox.click();
		} else {
			System.out.println("The check box is not enabled");
		}
		
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#message")));
        
        WebElement ele = driver.findElement(By.cssSelector("p#message"));
        if (ele.isDisplayed()) {
        	String text = ele.getText();
        	System.out.println(text);
        } else {
        	System.out.println("Text is not displayed");
        }
        
        driver.quit();
	}

}
