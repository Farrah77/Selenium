package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class HomeWorkTask3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
	
		setUpDriver("chrome", "https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
		switchToFrame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("datepicker")).click();
		WebElement month = driver.findElement(By.xpath("//span[text()='Next']"));
		while (month.getText().equals("August")) {
			Thread.sleep(3000);
			month.click();
			
		}
		
		
		driver.close();

	}
}
