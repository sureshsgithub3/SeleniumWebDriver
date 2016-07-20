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
public class GetText_Command {

	/**
	 * 
	 * String– This method will fetch the visible (i.e. not hidden by CSS) innerText of the element.
	 *  This accepts nothing as a parameter but returns a String value.
	 *  This returns an innerText of the element, including sub-elements, without any leading or trailing whitespace.
	 * 
	 */
	public static void main(String[] args) {
		WebDriver driver;
        driver= new FirefoxDriver();
		
		driver.get("http://demoqa.com");
		//clicking button 
		String text=driver.findElement(By.id("menu-item-374")).getText();
		System.out.println(text);

	}

}
