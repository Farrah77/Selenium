package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//a[text()='Select']")).click();
		
		//First DropDown
		WebElement countriesDD = driver.findElement(By.id("countriesSingle"));
	    Select country1 = new Select(countriesDD);
	    List <WebElement> allCountries = country1.getOptions();
	    System.out.println("The total number of countries in 1st DD is "+allCountries.size());
	    country1.selectByVisibleText("United states of America");
	
	    //Second DD
	    WebElement countries = driver.findElement(By.cssSelector("select#countriesMultiple"));
	    Select country = new Select(countries);
	    List <WebElement> allCountries2 = country.getOptions();
	    System.out.println("The total number of countries in 2nd DD is "+allCountries2.size());
	    //check if we can select multiple options
	    if (country.isMultiple()) {
	    	for (int i=0; i<allCountries2.size(); i++) {
		    	country.selectByIndex(i);
		    }
	    }
	    country.deselectByVisibleText("China");
	    
	    driver.quit();
	    
	}

}
