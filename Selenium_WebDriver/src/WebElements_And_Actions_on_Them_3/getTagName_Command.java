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
 * getTagName( ) : String– This method gets the tag name of this element.
 * This accepts nothing as a parameter and returns a String value.
 * element.getTagName();
 * This does not return the value of the name attribute but return the tag for e.g. “input“ for the element <input name="foo"/>.
 * 
 * 
 */
public class getTagName_Command {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver;
        driver= new FirefoxDriver();
		
		driver.get("http://demoqa.com");
		//clicking button 
		String tagname=driver.findElement(By.id("menu-item-374")).getTagName();
		System.out.println(tagname);
	}

}
