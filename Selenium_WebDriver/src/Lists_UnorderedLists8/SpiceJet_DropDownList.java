/**
 * 
 */
package Lists_UnorderedLists8;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * launch spice jet
 * click from from 
 * select all cities into list
 *
 */
public class SpiceJet_DropDownList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver;
		driver= new FirefoxDriver();
		
		
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		List<WebElement> Demostic_international =new ArrayList<WebElement>(driver.findElements(By.xpath(".//table[@id='citydropdown']//h3")));
		int size1= Demostic_international.size();
		System.out.println(size1);
		
		//itertating through india and international
		for(int i=1;i<=size1;i++){
			WebElement flighttypes=driver.findElement(By.xpath(".//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']/h3"));
			System.out.println(flighttypes.getText());
			
			List<WebElement> DomesticCities=new ArrayList<WebElement>(driver.findElements(By.xpath(".//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul")));
			int size2= DomesticCities.size();
			for(int j=1;j<=size2;j++){
				//WebElement Cities=driver.findElement(By.xpath(".//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul["+j+"]/li"));
				List<WebElement>Cities=new ArrayList<WebElement>(driver.findElements(By.xpath(".//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul["+j+"]/li")));
				int size3=Cities.size();
				for(int k=1;k<=size3;k++){
					WebElement citynames=driver.findElement(By.xpath(".//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul["+j+"]/li["+k+"]"));
					
					if(i==1){
						System.out.println("Domestic names :"+citynames.getText());
					}
					else{
						System.out.println("Internationsl :"+citynames.getText());
					}
						
				}
			}
			
		}
		

	}

}
