/**
 * 
 */
package WebElements_And_Actions_on_Them_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 *
 */
public class GetSize_Command {

	/**
	 * getSize( ) : Dimension – This method fetch the width and height of the rendered element.
	 * This accepts nothing as a parameter but returns the Dimension object.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		WebDriver driver;
        driver= new FirefoxDriver();
		
		driver.get("http://demoqa.com");
		//clicking button 
	WebElement element=	driver.findElement(By.id("menu-item-374"));
	Dimension dimension=element.getSize();
	System.out.println("Height :"+dimension.height+"Width :"+dimension.width);

	}

}
