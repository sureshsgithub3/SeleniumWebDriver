/**
 * 
 */
package BrowserCommands_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 *  This method load a new webpage in the current browser window
 *  accepts string as a parameter and returns nothing
 */
public class GetCommand {
	
	WebDriver driver;
	
	
	public void openup(){
		driver= new FirefoxDriver();
		//This method load a new webpage in the current browser window
		driver.get("http://toolsqa.com/selenium-webdriver/browser-commands/");
	}

}
