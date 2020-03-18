package org.virtual.selenium.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/rahul/eclipse-workspace/test1/lib/driver/chromedriver");
		WebDriver driver=new ChromeDriver();
			driver.get("http://kushala.org/workspace/virtual-university/");
			
	}

}