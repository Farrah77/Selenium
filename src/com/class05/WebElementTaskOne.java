package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTaskOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	    driver.findElement(By.cssSelector("input.btn_action")).click();
		
	    boolean isDisplayed = driver.findElement(By.cssSelector("div.peek")).isDisplayed();

		if (isDisplayed) {
			System.out.println("Robot Icon is displayed");
		} else {
			System.out.println("Robot Icon is NOT displayed");
	}
		WebElement products = driver.findElement(By.xpath("//div[@class='product_label']"));
		String value = products.getText();

		if (value.equals("Products")) {
			System.out.println("Test case PASS");
		} else {
			System.out.println("Test case FAIL");
		}

	}
}

