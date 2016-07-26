package WebTables_Pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediifMoney {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// storing table data in rows list
		
		List<WebElement> Company_stocks=new ArrayList<WebElement>(driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr")));
		//gettings its size
		int company_stocks_size=Company_stocks.size();
		System.out.println("company_stocks_table_columns: "+company_stocks_size);
		
		
		for(int rows=0;rows<company_stocks_size;rows++){
			//storing columns of rows in to list
			List<WebElement> stock_details=Company_stocks.get(rows).findElements(By.tagName("td"));
			
			for(int columns=0;columns<stock_details.size();columns++){
				//getting row wise details in to string
				String details=stock_details.get(columns).getText();
				//printing all details
				System.out.println(details);
			}
			System.out.println("----------------------------------------");
		}
		
		
		
		//this programe extract data from tables with headings

	}

}
