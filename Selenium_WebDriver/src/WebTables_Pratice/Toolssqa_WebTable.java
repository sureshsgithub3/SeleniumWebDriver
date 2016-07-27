package WebTables_Pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Toolssqa_WebTable {
	
	public static void main(String[] args){
		WebDriver driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		WebElement heading_element=driver.findElement(By.xpath(".//*[@id='content']/table/thead"));
		List<WebElement>table_headings=heading_element.findElements(By.tagName("tr"));
		int size1=table_headings.size();
		System.out.println(size1);
		
		
		WebElement Table_element=driver.findElement(By.xpath(".//*[@id='content']/table/tbody"));
		List<WebElement>table_data=Table_element.findElements(By.tagName("tr"));
		int size2=table_data.size();
		System.out.println(size2);
		
		int rowno=0;
		
		for(int row=0;row<size2;row++){
			System.out.println(rowno++);
			
			List<WebElement> table_data_columns=table_data.get(row).findElements(By.tagName("td"));
			// for th tags it row should be 0 because a table can have only one row of th rows
			List<WebElement> table_heading_columns=table_headings.get(0).findElements(By.tagName("th"));
			
			for(int columns =0;columns<table_data_columns.size();columns++){
				String celltext=table_data_columns.get(columns).getText();
				String HeadCelltext=table_heading_columns.get(columns).getText();
				System.out.println(HeadCelltext+" "+celltext);
			}
			System.out.println("-----------------------");
			
			
			
			
			
			
			
			
			
			
		}
	}

}
