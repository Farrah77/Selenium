package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemoSpecialCharacter {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	   /*
	    * css=tag[attribute=’value’]
css=tag.class
css=tag^='value']     for starts with
css=tag$='value']     for ends with
css=tag*='value']     for contains
	 * 
	 */
			
	driver.get("http://newtours.demoaut.com/");
	//CSS Tag/Attribute/Value
	driver.findElement(By.cssSelector("a[href*='mercuryregister.php']")).click();
	driver.findElement(By.cssSelector("input[name^='first']")).sendKeys("Elizabeth");
	driver.findElement(By.cssSelector("input[name*='last']")).sendKeys("Benneth");
	driver.findElement(By.cssSelector("input[name^='pho']")).sendKeys("+110220330");
	driver.findElement(By.cssSelector("input[name^='user']")).sendKeys("marioncherry123@gmail.com");
	
	//CSS Tag Class
	driver.findElement(By.cssSelector("input[name&='ess1']")).sendKeys("Benneth House");
	//driver.findElement(By.cssSelector("//input[contains(@name,'address2')]")).sendKeys("Benneth House");
	//driver.findElement(By.cssSelector("//input[contains(@name,'city')]")).sendKeys("Hartfordshird");
	//driver.findElement(By.cssSelector("//input[contains(@name,'state')]")).sendKeys("York");
	//driver.findElement(By.cssSelector("//input[contains(@name,'postalCode')]")).sendKeys("112233");
	//driver.findElement(By.xpath("//input[@name='country']")).sendKeys("USA");
	
	//Starts With X Path 
	driver.findElement(By.cssSelector("input#email")).sendKeys("marioncherry123@gmail.com");
	driver.findElement(By.cssSelector("input[name&='word']")).sendKeys("marionberry111");
	driver.findElement(By.cssSelector("input[name^='confirm']")).sendKeys("marionberry111");
	driver.findElement(By.cssSelector("//input[starts-with(@name,'regis')]")).click();
	driver.quit();


	}

}
