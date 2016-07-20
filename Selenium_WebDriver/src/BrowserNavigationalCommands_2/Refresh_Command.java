/**
 * 
 */
package BrowserNavigationalCommands_2;

import org.openqa.selenium.WebDriver;

/**
 * @author suresh
 * 
 * driver.navigate().refresh();
 * This method Refresh the current page. It neither accepts nor returns anything.
 *
 */
public class Refresh_Command {

	
WebDriver driver;
	
	public void openup(){
		driver.navigate().to("http://toolsqa.com/selenium-webdriver/browser-navigation-commands/");
		driver.navigate().refresh();
	}

}
