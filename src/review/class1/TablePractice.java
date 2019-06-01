package review.class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class TablePractice extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/tables");

		List<WebElement> list = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println(list.size());
		for (int i = 1; i <= list.size(); i++) {
			if (i >= 6) {
				String text = driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th[" + i + "]")).getText();
				System.out.println(text.equals("Printer"));
			} else {
				System.out.println("fail");
			
}
}
		
}}
