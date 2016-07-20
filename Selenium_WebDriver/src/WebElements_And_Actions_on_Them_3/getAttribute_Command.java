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
public class getAttribute_Command {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
        driver= new FirefoxDriver();
		
		driver.get("http://demoqa.com");
		//clicking button 
		driver.findElement(By.id("menu-item-374")).click();
		Thread.sleep(5000);
		WebElement element= driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));
		String attribute=element.getAttribute("name");
		System.out.println(attribute);
		

	}

}
