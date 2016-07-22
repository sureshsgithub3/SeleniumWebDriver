/**
 * 
 */
package Sandipan;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * @author suresh
 *
 */
public class MakeMytripcalendar {

	/**
	 * @param args
	 */
	WebDriver driver;
	@Test
	public void bookHotel() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("from_city_data_box")).sendKeys("Hydera");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Hyderabad, India (556 Hotels)')]"))).click();
		driver.findElement(By.id("start_date_sec")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-datepicker-div")));
		//driver.findElement(By.id("hotels_submit")).click();
		//if(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='modal-dialog']")))){
			//System.out.println("We get hold of that BASTERD");
		//}
		By tableLocator =  By.xpath("//div[@id='ui-datepicker-div']/div[1]/table");
		//System.out.println(tableHelper(tableLocator, getDayOfMonth()));
		String dateToSet = tableHelper(tableLocator, getDayOfMonth());
		
		setCheckInDate(tableLocator, dateToSet);
		//tableHelper(tableLocator, getDayOfMonth());
		Thread.sleep(5000);
		driver.quit();
	}
	public int getDayOfMonth(){
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		//Integer daysOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		return cal.get(Calendar.DAY_OF_MONTH);
	}
	public String tableHelper(By locator, int dayOfMonth){
		
		WebElement table = driver.findElement(locator);
		List<WebElement> tds = new ArrayList<WebElement>();
		tds = table.findElements(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		for(WebElement ele : tds){
			String a = ele.getText();
			//System.out.println(ele.getText());
			//if(ele.getText().isEmpty() && Integer.parseInt(ele.getText())> dayOfMonth)
				//return ele.getText();	
			
			if(!ele.getText().isEmpty() && !ele.getText().equals(" ")){
				if(Integer.parseInt(ele.getText())> dayOfMonth)
					return ele.getText();
			}
		}
		return "";
		
	}
	
	public void setCheckInDate(By locator, String dateToSet){
		WebElement table = driver.findElement(locator);
		List<WebElement> tds = new ArrayList<WebElement>();
		tds = table.findElements(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		for(WebElement td : tds){
			if(td.getText().equals(dateToSet)){
				td.click();
				break;
			}
			
		}
		
	}

}
