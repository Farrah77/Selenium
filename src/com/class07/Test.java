
package com.class07;

import util.CommonMethods;

public class Test extends CommonMethods {
	
	public static void main(String[] args) {
		
		CommonMethods.setUpDriver("firefox", "https://google.com");
		driver.close();
	}
}