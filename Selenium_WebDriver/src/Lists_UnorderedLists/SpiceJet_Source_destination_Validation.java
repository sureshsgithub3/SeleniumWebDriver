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
public class SpiceJet_Source_destination_Validation {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new FirefoxDriver();
		
		
		driver.get("http://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//click on source
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> dropdown1=new ArrayList<WebElement>(driver.findElements(By.xpath(".//li[@class='']/a")));
		
		for(WebElement ele:dropdown1){
			System.out.println(ele.getText());
			Thread.sleep(3000);
			driver.findElement(By.linkText(ele.getText()));
			 driver.findElement(By.id("")).click();
			//not completed 
			
			
			
		}
		System.out.println("done");
		
		
		}
		

	}


