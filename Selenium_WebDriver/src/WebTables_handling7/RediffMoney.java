package WebTables_handling7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffMoney {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		List<WebElement> tablerows=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr"));
		//List<WebElement> tablecolumns=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[1]/td"));
		
		/*System.out.println("Rows :"+tablerows.size());
		System.out.println("columns :"+tablecolumns.size());*/
		
		for(int row=0;row<tablerows.size();row++){
			List<WebElement> tablecolumnsdata=tablerows.get(row).findElements(By.tagName("td"));
			int columnscount=tablecolumnsdata.size();
			for(int columns=0;columns<columnscount;columns++){
				
				String celltext=tablecolumnsdata.get(columns).getText();
				System.out.print(celltext + " \t");
				
				
			}
			
			System.out.println("----------------------------------------");
			
			
		}
		

	}

}

