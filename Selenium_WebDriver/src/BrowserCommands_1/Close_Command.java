/**
 * 
 */
package BrowserCommands_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 * This method Close only the current window the WebDriver is currently controlling.
 * Accepts nothing as a parameter and returns nothing.
 *
 */
public class Close_Command {
	
	WebDriver driver;
	
	
	public void openup(){
		driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/selenium-webdriver/browser-commands/");
		//This method Close only the current window the WebDriver is currently controlling.
		driver.close();
		
	}

}
