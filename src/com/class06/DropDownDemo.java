package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
	
	//If we do not set the Property we will get java.lang.IllegalStateException
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	driver.manage().window().fullscreen();
	//identify DD with <select> and assign 
	WebElement continDD = driver.findElement(By.cssSelector("select#continents"));
	//Pass to the Select class Constructor 
	Select continent = new Select(continDD);
	
	//find how many options is available getOptions(); (return collection of elements)
	List <WebElement> allOptions = continent.getOptions();
	System.out.println("The total # of options in Continent DD is "+allOptions.size());
	System.out.println("--------All Options from Continent DD--------");
	for (int i=0; i<allOptions.size(); i++) {
		String text = allOptions.get(i).getText();
		System.out.println(text);
	}
	continent.selectByVisibleText("Europe");
	continent.selectByIndex(3);
	
	//Working with MultiSelect 
	WebElement commandsDD = driver.findElement(By.id("selenium+commands"));
	Select select = new Select(commandsDD);
	List <WebElement> allOptions1=select.getOptions();
	System.out.println("The total # of commands DD is " + allOptions1.size());
	//to print each commands value we use Iterator 
	System.out.println("---------All Options from Commands DD--------");
	Iterator <WebElement> it = allOptions1.iterator();
	while(it.hasNext()) {
		String optionText = it.next().getText();
		System.out.println(optionText);
	}
	if (select.isMultiple()) { //checks if DD supports multiple options 
		select.selectByVisibleText("NavigationCommands");
		select.selectByIndex(2);
		select.selectByIndex(3);
		select.selectByIndex(4);
	} 
	//deselect from Multi Select DD only (from single it will give UnsupportedOperationException
	select.deselectByIndex(2);
	
} }