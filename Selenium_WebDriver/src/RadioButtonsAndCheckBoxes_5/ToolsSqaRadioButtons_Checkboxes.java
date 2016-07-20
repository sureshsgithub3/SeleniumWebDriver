/**
 * 
 */
package RadioButtonsAndCheckBoxes_5;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ToolsSqaRadioButtons_Checkboxes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver;
		driver= new FirefoxDriver();
		driver.navigate().to("http://toolsqa.com/automation-practice-form");
		
		//storing all the webelemts elements in the list of radiobuttons_sex
		List<WebElement>rdbtn_sex=new ArrayList<WebElement>(driver.findElements(By.name("sex")));
		
		//create a boolean variable in which will hold the value (true/false)
		boolean bvalue=false;
		
		//this statement will return true,in case radiobutton selected
		bvalue=rdbtn_sex.get(0).isSelected();
		//this will check that if the value is true or false
		
		if (bvalue==true){
			rdbtn_sex.get(1).click();
		    }
			else
			{
				rdbtn_sex.get(0).click();
			}
		
		//Select the Third radio button for category 'Years of Exp' (by id ='exp-2'
		
		driver.findElement(By.id("exp-2")).click();
		
		//Check the Check Box 'Automation Tester' for category 'Profession''( Use Value attribute to match the selection)
		//find the check box or radio button element by name
		
		List<WebElement> chckbox= new ArrayList<WebElement>(driver.findElements(By.name("profession")));
		
		//no of check boxes
		
		int s=chckbox.size();
		
		for(int i=0;i<s;i++){
			String svalue=chckbox.get(i).getAttribute("value");
			//select the check box if the value is automation tester
			if(svalue.equalsIgnoreCase("Automation Tester")){
				chckbox.get(i).click();
				break;
			}
		}
		
		List<WebElement> AutoType= new ArrayList<WebElement>(driver.findElements(By.name("tool")));
		
		for(WebElement ele:AutoType){
			
			String elevalue=ele.getAttribute("value");
			//select if Selenium Webdriver is there
			if(elevalue.equalsIgnoreCase("Selenium Webdriver"))
			{
				ele.click();
			}
		}
		driver.quit();
		
		
		
		
			
		}
		

	}


