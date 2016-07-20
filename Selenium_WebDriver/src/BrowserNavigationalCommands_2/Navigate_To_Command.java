/**
 * 
 */
package BrowserNavigationalCommands_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 * driver.navigate().to(appUrl);
 * To access the navigation’s method, just type driver.navigate().. 
 * The intellisence feature of eclipse will automatically display all the public methods of Navigate Interface 
 * to(String arg0) : void – This method Loads a new web page in the current browser window
 *  It accepts a String parameter and returns nothing.
 */
public class Navigate_To_Command {
	
	WebDriver driver;
	
	
	public void openup(){
		driver= new FirefoxDriver();
		driver.navigate().to("http://toolsqa.com/selenium-webdriver/browser-navigation-commands/");
	}

}
