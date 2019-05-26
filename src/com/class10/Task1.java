package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		
        setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		List <WebElement> columns = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        
		System.out.println("The total number of columns is "+columns.size());
		System.out.println("--------Values in Column Headers--------");
        
		for (WebElement column: columns) {
			String columnText=column.getText();
			System.out.println(columnText);
		}
		
		List <WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("The total number of rows is "+rows.size());
		System.out.println("--------Values in Rows--------");
		for (WebElement row:rows) {
			String rowText = row.getText();
			System.out.println(rowText);
		}
		
		driver.close();
	
	}

}
