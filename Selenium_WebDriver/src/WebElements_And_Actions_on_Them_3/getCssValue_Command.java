/**
 * 
 */
package WebElements_And_Actions_on_Them_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 *
 */
public class getCssValue_Command {

	/**
	 * getCssvalue( ) : String– This method Fetch CSS property value of the give element. 
	 * This accepts nothing as a parameter and returns a String value.
	 * 
	 * Command – element.getCssValue();
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
        driver= new FirefoxDriver();
		
		driver.get("http://demoqa.com");
		//clicking button 
		driver.findElement(By.id("menu-item-374")).click();
		Thread.sleep(3000);
		WebElement element= driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));
		String cssvalue=element.getCssValue("name");
		System.out.println(cssvalue);
		
	}

}
