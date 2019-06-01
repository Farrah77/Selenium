package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import util.CommonMethods;

public class FileUploadSSTestCase extends CommonMethods {

	public static void main(String[] args) {
	/*
	 * Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
Upload file
Verify file got successfully uploaded and take screenshot	
	 */
	
	setUpDriver("chrome", "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
	
	String filePath= "⁩/⁨Users⁩/farrah⁩/⁨Desktop/fileupload.png";
	driver.findElement(By.cssSelector("input#gwt-debug-cwFileUpload")).sendKeys(filePath);
	driver.findElement(By.cssSelector("button.gwt-Button")).click();
	
	TakesScreenshot image=(TakesScreenshot)driver;
	File srcFile=image.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcFile, new File("screenshot/Task/TaskImage.png"));
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("Image is not taken");
	}
	
	Alert alert = driver.switchTo().alert();
    String expected = "File uploaded!";
    String actual = alert.getText(); //full code in functions
    if (actual.equals(expected)) {
        System.out.println("File is uploaded successfuly");
    } else {
        System.out.println("File was not uploaded");
    }
    alert.accept();
	
	driver.close();

}}
	
