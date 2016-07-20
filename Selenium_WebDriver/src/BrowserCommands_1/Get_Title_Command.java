/**
 * 
 */
package BrowserCommands_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 *This method fetches the Title of the current page. 
 *Accepts nothing as a parameter and returns a String value.
 *
 */
public class Get_Title_Command {
	WebDriver driver;
	
	
	public void openup(){
		driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/selenium-webdriver/browser-commands/");
		
		//This method fetches the Title of the current page. 
		String title =driver.getTitle();
		
		System.out.println(title);
	}
	

}
