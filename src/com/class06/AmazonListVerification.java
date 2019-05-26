package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonListVerification {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://amazon.com");
	driver.manage().window().fullscreen();
	
	WebElement departList = driver.findElement(By.cssSelector("select#searchDropdownBox"));
    Select department = new Select(departList);
    List <WebElement> allDepartments = department.getOptions();
    int numDep = allDepartments.size() -1;
    System.out.println("The total number of department on Amazon.com is "+numDep);
    
    for (int i=0; i<allDepartments.size(); i++) {
    	String text = allDepartments.get(i).getText();
    	System.out.println(text);
    }
    
    department.selectByVisibleText("Computers");
    driver.quit();
    
	}

}
