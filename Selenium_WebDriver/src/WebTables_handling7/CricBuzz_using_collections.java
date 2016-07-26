package WebTables_handling7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CricBuzz_using_collections {

	public static void main(String[] args) {
		

		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/16450/sl-vs-aus-1st-test-australia-tour-of-sri-lanka-2016");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		List<WebElement> Scorecard=driver.findElements(By.xpath(".//*[@id='innings_1']/div[1]/div"));
		//int rowscount=rows.size();
		
		for(WebElement batsmanScorecard:Scorecard){
			System.out.print(batsmanScorecard.getText());
		}
		

	}

}
