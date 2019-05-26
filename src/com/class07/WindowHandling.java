package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import util.CommonMethods;

public class WindowHandling extends CommonMethods {

	public static void main(String[] args) {
	
	CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
	//Go to Parent Window and get Title and ID
	String parent = driver.getTitle();
	String parentID = driver.getWindowHandle();
	System.out.println("The title of parent window is "+parent+" and ID:"+parentID);
	
	//Click on the link to open New Window
	driver.findElement(By.xpath("a[text()='Opens in a new window']")).click();
	
	//Iterate to go through the titles (parent/child)
	Set <String> allWindows = driver.getWindowHandles();
	Iterator <String> it = allWindows.iterator();
	parent=it.next();
	String child=it.next();
	
	//Swithc to Child Window
	driver.switchTo().window(child);
	
	//Get child Window Title and ID
	child = driver.getTitle();
	String childID = driver.getWindowHandle();
	System.out.println("The title of child window is "+child+" and ID:"+childID);

	driver.switchTo().window(parent);
	
	}

}
