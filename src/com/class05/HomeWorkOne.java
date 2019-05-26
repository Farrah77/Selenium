package com.class05;

import java.util.List;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkOne {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/farrah/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().fullscreen();
		
//First & Last Names
driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("John");
driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Smith");
		

//Sex Button
String valueToSelect = "Male";
List<WebElement> sexButton = driver.findElements(By.id("sex-0"));

	for (WebElement button : sexButton) {
		if (button.isEnabled()) {
				String value = button.getAttribute("value");
				System.out.println(value);
			if (value.equals(valueToSelect)) {
				button.click();
				}
			}}
	
//Years of Experience		
List <WebElement> yearsButton = driver.findElements(By.name("exp"));
Iterator <WebElement> it=yearsButton.iterator();
while(it.hasNext()) {
WebElement year=it.next();
if(year.isEnabled()) {
year.click(); } }
		
//Date
driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08.12.2019");
System.out.println("08.12.2019");		
		
//Profession Button 
String valueToSelect2 = "Manual Tester";
String valueToSelect1 = "Automation Tester";
		
List <WebElement> professionList = driver.findElements(By.name("profession"));
for (WebElement profession : professionList) {
	if (profession.isEnabled()) {
    String value = profession.getAttribute("value");
	System.out.println(value);
		if (value.equals(valueToSelect)) {
			profession.click();
				} }}
		
// Automation Tools
List <WebElement> autoTools = driver.findElements(By.xpath("//input[@name='tool']"));
for (WebElement tool : autoTools) {
	String autoTool=tool.getAttribute("value");
		if (tool.isEnabled()) {
			System.out.println(autoTool + " is clickable");
		} if (autoTool.equals("Selenium WebDriver")) {
			System.out.println(autoTool);
			tool.click(); 
		}}
	
driver.quit();
		
	}
		
	
	}


