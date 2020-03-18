package org.virtual.selenium.SeleniumDemo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    public static void main(String[] args) {
    	
    	String path = System.getProperty("user.dir");
    	
		System.setProperty("webdriver.chrome.driver", path+"eclipse-workspace/main/driver/chromedriver");
		WebDriver driver=new ChromeDriver();
			driver.get("http://kushala.org/workspace/virtual-university/");
			
	}

}
