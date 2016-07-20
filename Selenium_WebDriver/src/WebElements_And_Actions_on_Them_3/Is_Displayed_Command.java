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
public class Is_Displayed_Command {

	/**
	 * isDisplayed( ) : boolean – This method determines if an element is currently being displayed or not.
	 * This accepts nothing as a parameter but returns boolean value(true/false).
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		WebDriver driver ;	
		
        driver= new FirefoxDriver();
		
		driver.get("http://demoqa.com");
		//clicking button 
		driver.findElement(By.id("menu-item-374")).click();
		Thread.sleep(3000);
		boolean rsult=driver.findElement(By.id("name_3_firstname")).isDisplayed();
		System.out.println(rsult);

	}

}
