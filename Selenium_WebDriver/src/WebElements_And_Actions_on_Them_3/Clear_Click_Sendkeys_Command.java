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
 * 
 * element.clear();
 * If this element is a text entry element, this will clear the value.
 *  This method accepts nothing as a parameter and returns nothing.
 *  element.sendkeys();
 *  This simulate typing into an element, which may set its value. 
 *  This method accepts CharSequence as a parameter and returns nothing.
 *  This method works fine with text entry elements like INPUT and TEXTAREA elements.
 *  element.click();
 *  This simulates the clicking of any element. Accepts nothing as a parameter and returns nothing.
 *  
 */
public class Clear_Click_Sendkeys_Command {
	
	WebDriver driver ;
	
	
	public void openup() throws InterruptedException{
		driver= new FirefoxDriver();
		
		driver.get("http://demoqa.com");
		//clicking button 
		driver.findElement(By.id("menu-item-374")).click();
		Thread.sleep(3000);
		//sending data to text box
		driver.findElement(By.id("name_3_firstname")).sendKeys("suresh");
		//clearing first name
		driver.findElement(By.id("name_3_firstname")).clear();
		
		
	}

}
