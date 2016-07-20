/**
 * 
 */
package WebElements_And_Actions_on_Them_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 *
 */
public class IsEnabled_Command {

	/**
	 * isEnabled( ) : boolean – This determines if the element currently is Enabled or not?.
	 * his accepts nothing as a parameter but returns boolean value(true/false).
	 * 
	 */
	public static void main(String[] args) {
        WebDriver driver ;	
		
        driver= new FirefoxDriver();
		
		driver.get("http://demoqa.com");
		
	boolean rsult=	driver.findElement(By.id("menu-item-374")).isEnabled();
	
	System.out.println(rsult);

	}

}
