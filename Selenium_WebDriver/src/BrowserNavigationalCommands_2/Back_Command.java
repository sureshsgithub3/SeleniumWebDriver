/**
 * 
 */
package BrowserNavigationalCommands_2;

import org.openqa.selenium.WebDriver;

/**
 * @author suresh
 * driver.navigate().back();
 * This method does the same operation as clicking on the Back Button of any browser.
 * It neither accepts nor returns anything.
 *
 */
public class Back_Command {
	
	WebDriver driver;
	
	public void openup(){
		driver.navigate().to("http://toolsqa.com/selenium-webdriver/browser-navigation-commands/");
		driver.navigate().back();
	}

}
