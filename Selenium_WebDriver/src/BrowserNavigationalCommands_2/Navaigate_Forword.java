/**
 * 
 */
package BrowserNavigationalCommands_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 * 
 * driver.navigate().forward();
 *  This method does the same operation as clicking on the Forward Button of any browser.
 *  It neither accepts nor returns anything.
 */
public class Navaigate_Forword {
	
	WebDriver driver;
	
	public void openup(){
		driver= new FirefoxDriver();
		driver.navigate().to("http://toolsqa.com/selenium-webdriver/browser-navigation-commands/");
		
		driver.navigate().forward();
		
	}

}
