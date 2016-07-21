/**
 * 
 */
package Lists_UnorderedLists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 *
 */
public class SpiceJetComparsion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver;
		driver= new FirefoxDriver();
		
		
		driver.get("http://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//click on source
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Agartala (IXA)")).click();
		String selectedoption=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("value");
		System.out.println(selectedoption);
		
		List<WebElement>options= new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='dropdownDiv']//li")));
		
		for(WebElement ele:options){
			System.out.println(ele.getText());
			if(selectedoption.equalsIgnoreCase(ele.getText())){
				System.out.println("Test failed");
			}
			
		}
		

	}

}
