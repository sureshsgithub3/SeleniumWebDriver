/**
 * 
 */
package DropDowns_6;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author suresh
 *
 */
public class PractiseDropDown7 {

	/**
	 * Launch new Browser
	 * Open “http://toolsqa.com/automation-practice-form/”
	 * Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
	 * Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
	 * Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
	 * Print and select all the options for the selected Multiple selection list.
	 * Deselect all options
	 * 
	 * 
	 */
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		//Open “http://toolsqa.com/automation-practice-form/
		driver.get("http://toolsqa.com/automation-practice-form");
		//find selenium_commands and pass it to arraylist
		Select oselect = new Select(driver.findElement(By.id("selenium_commands")));
		List<WebElement>options= new ArrayList<WebElement>(oselect.getOptions());
		
		for(int i=0;i<options.size();i++){
			String optionsvalues=options.get(i).getText();
			System.out.println(optionsvalues);
			
			if(optionsvalues.equalsIgnoreCase("Navigation Commands")){
				oselect.selectByVisibleText("Navigation Commands");
			}
			if(optionsvalues.equalsIgnoreCase("Switch Commands")){
				oselect.selectByVisibleText("Switch Commands");
				
			}
		}
		oselect.deselectAll();
		

	}

}
