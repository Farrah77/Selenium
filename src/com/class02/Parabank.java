package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("Farrah");
		driver.findElement(By.name("customer.lastName")).sendKeys("Mamadieva");
		driver.findElement(By.id("customer.address.street")).sendKeys("1000 Waverly street");
		driver.findElement(By.name("customer.address.city")).sendKeys("Beverly Hills");
		driver.findElement(By.name("customer.address.state")).sendKeys("California");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("10007");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("900-700-4535");
		driver.findElement(By.id("customer.ssn")).sendKeys("111-222-3345");
		driver.findElement(By.id("customer.username")).sendKeys("Farrah");
		driver.findElement(By.id("customer.password")).sendKeys("FarrahFarrah7");
		driver.findElement(By.id("repeatedPassword")).sendKeys("FarrahFarrah7");
		driver.findElement(By.className("button")).click();
		driver.close();

	}

}
