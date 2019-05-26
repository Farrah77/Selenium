package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.CommonMethods;

public class WaitTask extends CommonMethods {

	public static void main(String[] args) {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#finish")));
        
        WebElement ele = driver.findElement(By.cssSelector("div#finish"));
        if (ele.isDisplayed()) {
        	String text = ele.getText();
        	System.out.println(text);
        } else {
        	System.out.println("Text is not displayed");
        }
        
        driver.quit();
	}

}
