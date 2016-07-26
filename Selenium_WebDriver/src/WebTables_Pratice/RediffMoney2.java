package WebTables_Pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffMoney2 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement heads= driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/thead"));
		List<WebElement>headings=heads.findElements(By.tagName("tr"));
		
		WebElement details=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody"));
		List<WebElement>stck_details=details.findElements(By.tagName("tr"));
		System.out.println(stck_details.size());
		
		for(int rows=0;rows<stck_details.size();rows++){
			List<WebElement>Stck_heading=headings.get(rows).findElements(By.tagName("th"));
			List<WebElement>Stock_columns=stck_details.get(rows).findElements(By.tagName("td"));
			
			for(int columns=0;columns<Stock_columns.size();columns++){
				String Stock_heads=Stck_heading.get(columns).getText();
				String Stock_details=Stock_columns.get(columns).getText();
				System.out.println(Stock_heads +" "+Stock_details);
						
			}
			System.out.println("-----------------------------");
		}
		
		


	}

}
