package org.virtual.selenium.SeleniumDemo;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest 
{
	String path = System.getProperty("user.dir");
	private WebDriver driver;
    String appURL = "www.google.com";
    @Test
    public void testsetup()
    {
    	System.setProperty("webdriver.chrome.driver", path+"eclipse-workspace/main/driver/chromedriver");
    	driver=new ChromeDriver();
    }
    
    public void verify() {
    	driver.navigate().to(appURL);
    	String getTitle = driver.getTitle();
    	System.out.println("the title of the page is"+getTitle);
    	System.out.println("pass");
    	
			
	}

}
