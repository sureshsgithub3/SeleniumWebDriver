package WebTables_handling7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CricBuzz {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/16450/sl-vs-aus-1st-test-australia-tour-of-sri-lanka-2016");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//extract data from entire table
		
		String xp_start=".//*[@id='innings_1']/div[1]/div[";
		String xp_mid="]/div[";
		String xp_end="]";
		
		try{
			int rowcnt=0;
			for(int row =2;row<=14;row++){
				
				for(int column=1;column<=7;column++){
				String x= driver .findElement(By.xpath(xp_start+row+xp_mid+column+xp_end)).getText();
				System.out.print(x);
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.println("Nothing");
		}
		

	}

}
