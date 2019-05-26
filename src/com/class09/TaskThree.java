package com.class09;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.CommonMethods;

public class TaskThree  extends CommonMethods {

	public static void main(String[] args) {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Disable']")));
		
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		textBox.click();
		textBox.sendKeys("Hello");
		
		driver.findElement(By.xpath("//button[text()='Disable']")).click();
		
		WebElement actualText = driver.findElement(By.cssSelector("p#message"));
		
		if (actualText.isDisplayed()) {
			String text= actualText.getText();
			System.out.println("Text is entered and displayed: "+text);
			
		} else {
			System.out.println("Text is not displayed");
		}
		
		driver.close();
		
		

	}

}
