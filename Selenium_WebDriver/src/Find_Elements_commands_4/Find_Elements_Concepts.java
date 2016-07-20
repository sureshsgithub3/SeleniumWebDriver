/**
 * 
 */
package Find_Elements_commands_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 *
 */
public class Find_Elements_Concepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver;
        driver= new FirefoxDriver();
		
		driver.get("http://toolsqa.com/Automation-practice-form/");
		//Find Element by id
	    WebElement element=	driver.findElement(By.id("menu-item-374"));
	    
	    //By name
	    driver.findElement(By.name("firstname"));
	    //find element button By classname 
	    
	    driver.findElement(By.className("btn btn-info")).click();
	    
	    //finding buttun by tagname
	    driver.findElement(By.tagName("button"));
	    //finding element link text by LINk Text and partial link text
	    
	    driver.findElement(By.partialLinkText("Partial Link Test")).click();
	    driver.findElement(By.linkText("Link Test")).click();
	    
	    //finding Element with Xpath
	    driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("suresh");

	}

}
