package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWFacebook {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://facebook.com");
	
	//Months
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select months = new Select(month);
	List <WebElement> listMonth = months.getOptions();
	int numMonths = listMonth.size() - 1;
	System.out.println("Total number of months is "+numMonths);
	months.selectByVisibleText("Dec");
	
	//Days
	WebElement day = driver.findElement(By.name("birthday_day"));
	Select days = new Select(day);
	List <WebElement> dayList = days.getOptions();
	int numDays = dayList.size() - 1;
	System.out.println("The total number of days is "+numDays);
	days.selectByIndex(3);
	
	//Years 
	WebElement year = driver.findElement(By.name("birthday_year"));
	Select years = new Select(year);
	List <WebElement> yearList = years.getOptions();
	int numYears = yearList.size() - 1;
	System.out.println("The total number of year options is "+numYears);
	years.selectByVisibleText("1982");
	}

}
