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
public class PractiseDropDowns1 {

	/**
	 * Launch new Browser
	 * Open “http://toolsqa.com/automation-practice-form/
	 * get all options in to list
	 * and select europe if there is 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		//Launch new Browser
		WebDriver driver= new FirefoxDriver();
		//Open “http://toolsqa.com/automation-practice-form/
		driver.get("http://toolsqa.com/automation-practice-form");
		//find continent drop downs
		Select oselect= new Select(driver.findElement(By.id("continents")));
		/*//select by index
        oselect.selectByIndex(5);
        Thread.sleep(2000);
        //select by value
        oselect.selectByValue("Europe");
        Thread.sleep(2000);
        //select By visible text
        oselect.selectByVisibleText("Europe");
        Thread.sleep(2000);*/
		
		//storing all the options in the arraylist and if europe is there in 
		//list then it will be selected
        
        List<WebElement>options=new ArrayList<WebElement>(oselect.getOptions());
        
       for(int i=0;i<options.size();i++){
    	   String optionvalue=options.get(i).getText();
    	   
    	   
    	   if(optionvalue.equalsIgnoreCase("Europe")){
    		   System.out.println(optionvalue);
    		   oselect.selectByIndex(i);
    		   break;
    	   }
       }
       
	}

}
