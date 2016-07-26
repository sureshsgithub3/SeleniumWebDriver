package WebTables_handling7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tools_Sqa_WebTable {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		//table headings
		WebElement tablehead=driver.findElement(By.xpath(".//*[@id='content']/table/thead"));
		List<WebElement> table_heads=tablehead.findElements(By.tagName("tr"));
		System.out.println("table headings: "+table_heads.size());
		
		//table data
		WebElement table=driver.findElement(By.xpath(".//*[@id='content']/table/tbody"));
		List<WebElement> table_rows=table.findElements(By.tagName("tr"));
		int rows_count=table_rows.size();
		System.out.println("total _rows "+rows_count);
		
		for(int row=0;row<rows_count;row++){
			List<WebElement> columns_of_row=table_rows.get(row).findElements(By.tagName("td"));
			List<WebElement> head_rows=table_heads.get(0).findElements(By.tagName("th"));
			int column_count=columns_of_row.size();
			//System.out.println("no of columns under row : "+row+"  are"+column_count );
			for(int column =0;column<column_count;column++){
				String celltext=columns_of_row.get(column).getText();
				String headText=head_rows.get(column+1).getText();
				//System.out.println("cell value of row heading  " +headText+  "(row number :"+row+") and column number "+column +" is "+celltext);
				System.out.println(headText + "  " + celltext);
				
			}
			//System.out.println("---------------------------------");
		}
		
		

	}

}
