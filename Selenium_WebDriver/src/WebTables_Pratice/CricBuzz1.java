package WebTables_Pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CricBuzz1 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/16450/sl-vs-aus-1st-test-australia-tour-of-sri-lanka-2016");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		List<WebElement> Aus_1st_ings=new ArrayList<WebElement>(driver.findElements(By.xpath(".//*[@id='innings_2']/div[1]/div")));
	    int rows=Aus_1st_ings.size();
	    System.out.println(rows);
	    
	    for(int row=0;row<rows;row++){
	    	String cellsdata=Aus_1st_ings.get(row).getText();
	    	System.out.println(cellsdata);
	    	if(cellsdata.equalsIgnoreCase("Joe Burns")){
	    		System.out.println("testpass");
	    	}
	    }
	    
	    
	  /*  List<WebElement> columns=new ArrayList<WebElement>(driver.findElements(By.xpath(".//*[@id='innings_2']/div[1]/div/div")));
	    int cells =columns.size();
	    System.out.println(cells);
	    */
	    
	    
	    
	   /* for(int row=0;row<rows;row++){
	    	List<WebElement> columns=Aus_1st_ings.get(row).findElements(By.xpath(".//*[@id='innings_2']/div[1]/div/div"));
	    	
	    	int cells =columns.size();
	    	System.out.println(cells);
	    	
	    	for(int column=0;column<cells;column++){
	    		String celldata=columns.get(column).getText();
	    		System.out.println(celldata);
	    	}
	    	System.out.println("------");
	    }*/

	}

}
