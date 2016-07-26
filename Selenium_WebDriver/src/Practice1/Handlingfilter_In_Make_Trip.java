/**
 * 
 */
package Practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * @author suresh
 *
 */
public class Handlingfilter_In_Make_Trip {
	
	
	@Test
	public void HandlingSliders() throws InterruptedException{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("from_city_data_box")).sendKeys("Hydera");
		WebDriverWait wait= new WebDriverWait(driver, 30);
		//wait until hyderbad hotels list drops 
		//selecting one hotel in dynamic drop down
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Weekend Getaways Around Hyderabad, India (23 Hotels)')]")));
		//click on submit
		driver.findElement(By.id("hotels_submit")).click();
		//handling or wait appear and disappear of loading 
		if(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='modal-content']")))){
			System.out.println("1st loading was handled");
			
		
		Actions sliders=new Actions(driver)	;
		// drag and drop of slider button on price range 
		sliders.dragAndDropBy(driver.findElement(By.xpath("//div[@id='angular_price_slider']/div/div[1]/div[2]")), 50, 0).build().perform();
		//handling or wait appear and disappear of loading 
		if(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("append_bottom8")))){
			System.out.println("we handled second wait");
		}
		Thread.sleep(5000);
		// drag and drop of slider button on price range 
		sliders.dragAndDropBy(driver.findElement(By.xpath("//div[@id='angular_price_slider']/div/div[1]/div[3]")), -50, 0).build().perform();
		//handling or wait appear and disappear of loading
		if(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("append_bottom8")))){
			System.out.println("we handled second wait 2 time");
			Thread.sleep(5000);
			
		}
		//getting start and end pirce preffered prisces by user
		String	 startingprice=driver.findElement(By.xpath("//div[@id='angular_price_slider']/p[2]/span[1]/span[2]")).getText();
		String   endingprice=driver.findElement(By.xpath("//div[@id='angular_price_slider']/p[2]/span[2]/span[2]")).getText();
		
		//converting them into 
		int sp=Integer.parseInt(startingprice);
		int ep=Integer.parseInt(endingprice);
		System.out.println(sp);
		System.out.println(ep);
		
		List<WebElement> list1= new ArrayList<WebElement>();
		list1=driver.findElements(By.xpath("//p[contains(@class,'actual_price')]"));
		System.out.println("We found : "+list1.size()+ " hotels in this price range");
		
		
		for(WebElement ele:list1){
			System.out.println(ele.getText());
		}
		
	
		
		
	}
		//driver.close();
	}

	}
