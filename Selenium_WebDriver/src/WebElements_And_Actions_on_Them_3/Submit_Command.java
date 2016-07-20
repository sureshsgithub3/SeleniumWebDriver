/**
 * 
 */
package WebElements_And_Actions_on_Them_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 * submit( ) : void– This method works well/better than the click() if the current element is a form, or an element within a form.
 * This accepts nothing as a parameter and returns nothing.
 * element.submit();
 * If this causes the current page to change, then this method will wait until the new page is loaded.
 * 
 */
public class Submit_Command {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver;
        driver= new FirefoxDriver();
		
		driver.get("http://demoqa.com");
		//clicking button 
		driver.findElement(By.id("menu-item-374")).submit();

	}

}
