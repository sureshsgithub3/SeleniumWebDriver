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
public class IsSelected_Command {

	/**
	 * sSelected( ) : boolean – Determine whether or not this element is selected or not.
	 * This accepts nothing as a parameter but returns boolean value(true/false).
	 * This operation only applies to input elements such as Checkboxes, 
	 * Select Options and Radio Buttons. This returns True if the element is currently selected or checked, false otherwise. 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
       WebDriver driver ;	
		
        driver= new FirefoxDriver();
		
		driver.get("http://demoqa.com");
		//clicking button 
		driver.findElement(By.id("menu-item-374")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name_3_firstname")).sendKeys("suresh");
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).click();
		// Determine whether or not this element is selected or not.
		//Note: In the later chapters of Check Box & Radio Buttons and Drop Down & Multiple Selects, we have covered many examples around it.
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).isSelected();
		

	}

}
