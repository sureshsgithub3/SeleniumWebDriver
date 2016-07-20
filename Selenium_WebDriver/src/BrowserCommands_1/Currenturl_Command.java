/**
 * 
 */
package BrowserCommands_1;

import org.openqa.selenium.WebDriver;

/**
 * @author suresh
 * This method fetches the string representing the Current URL.which is opened in the browser.
 * Accepts nothing as a parameter and returns a String value.
 */
public class Currenturl_Command {
	
	WebDriver driver;
	
	public void openup(){
		String actualurl= "http://toolsqa.com/selenium-webdriver/browser-commands/";
		driver.get("actualurl");
		String currenturl=driver.getCurrentUrl();
		
		if(actualurl.equals(currenturl)){
			System.out.println("Verification success");
		}
		else{
			System.out.println("Verification success");
		}
		
	}

}
