package WebTables_handling7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffMoney_Advanced {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//table headings
		WebElement table_heads=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/thead"));
		List<WebElement> headings=table_heads.findElements(By.tagName("tr"));
		System.out.println("no of heads :"+headings.size());
		
		//table data
		WebElement table=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody"));
		List<WebElement>tabledata=table.findElements(By.tagName("tr"));
		int rows_count=tabledata.size();
		System.out.println("rows_count:"+rows_count);
		
		
		
		
		for(int row=0;row<rows_count;row++){
			
			List<WebElement> columns_of_rows=tabledata.get(row).findElements(By.tagName("td"));
			List<WebElement> columns_of_headings=headings.get(row).findElements(By.tagName("th"));
			int cells_in_rows=columns_of_rows.size();
			System.out.println(row +"row   :"+ "cells are :"+cells_in_rows);
			
			for(int column=0;column<=columns_of_rows.size();column++){
				String headingtext=columns_of_headings.get(column).getText();
				String columnstext=columns_of_rows.get(column).getText();
				System.out.print(" "+headingtext+"  :"+columnstext);
			}
			System.out.println("------------------------");
		}
		
		
		
		

	}

}
