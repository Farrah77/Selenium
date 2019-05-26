
package com.class09;

import util.CommonMethods;

public class Test extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUpDriver("chrome","https://google.com");
		driver.close();
	}
}