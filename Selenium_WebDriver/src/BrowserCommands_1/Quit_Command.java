/**
 * 
 */
package BrowserCommands_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 *  This method Closes all windows opened by the WebDriver.
 *  Accepts nothing as a parameter and returns nothing.
 *  
 */
public class Quit_Command {
	
	
	WebDriver driver;
	
	
	public void Openup(){
		driver = new  FirefoxDriver();
		driver.get("http://toolsqa.com/selenium-webdriver/browser-commands/");
		//
		
		driver.quit();
	}
	

}
