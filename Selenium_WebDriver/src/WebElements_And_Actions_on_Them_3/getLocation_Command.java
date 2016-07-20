/**
 * 
 */
package WebElements_And_Actions_on_Them_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 *
 */
public class getLocation_Command {

	/**
	 * getLocation( ) : Point – This method locate the location of the element on the page.
	 * This accepts nothing as a parameter but returns the Dimension object.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		WebDriver driver;
        driver= new FirefoxDriver();
		
		driver.get("http://demoqa.com");
		//clicking button 
	    WebElement element=	driver.findElement(By.id("menu-item-374"));
	    Point point=element.getLocation();
	    System.out.println("x coordinate :"+point.x+"Y coordinates"+point.y);
	}

}
