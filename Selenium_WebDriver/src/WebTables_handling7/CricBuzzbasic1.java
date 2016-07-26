package WebTables_handling7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CricBuzzbasic1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/16450/sl-vs-aus-1st-test-australia-tour-of-sri-lanka-2016");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String start_xp=".//*[@id='innings_1']/div[1]/div[";
		String end_xp="]/div[1]/a";
		
		Thread.sleep(3000);
		try{
		int rowno=0;
		
		//to etract data from rows 
		for(int i=3;i<=15;i++){
			// appending i value in xpath because its dynamically changing 
			String x=driver.findElement(By.xpath(start_xp+ i +end_xp)).getText();
			rowno++;
			System.out.println(x);
		}
		System.out.println("Row count is :"+rowno);
		}
		catch(Exception e){
			System.out.println("Catched");
		}
		System.out.println("--------------");
		// extracting data from columns of last row
		
		String xp_start=".//*[@id='innings_1']/div[1]/div[13]/div[";
		String xp_end="]";
		int columncount=0;
		try{
		for(int j=3;j<=7;j++){
			// appending j value in xpath because its dynamically changing 
			String y= driver.findElement(By.xpath(xp_start+ j +xp_end)).getText();
			columncount++;
			System.out.println(y);
			
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
