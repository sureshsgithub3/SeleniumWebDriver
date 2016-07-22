package Sandipan;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeMytrip {
	/*
	 * Search prefrered hotels and validate price with inrange
	 * 
	
*/
	@Test
	public void serachFlight() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("from_city_data_box")).sendKeys("Hydera");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Hyderabad, India (556 Hotels)')]"))).click();;
		driver.findElement(By.id("hotels_submit")).click();
		if(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='modal-dialog']")))){
			System.out.println("We get hold of that BASTERD");
		}
		System.out.println("++++++++++++=Let work with another BASTERD : the slider++++++++++++++=");
		Actions sliders= new Actions(driver);
        //sliders.dragAndDropBy(driver.findElement(By.className("slider-handle")), 0, 100).build().perform();
		sliders.dragAndDropBy(driver.findElement(By.xpath("//div[@id='angular_price_slider']/div/div[1]/div[2]")), 50, 0).build().perform();
		if(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("append_bottom12")))){
			System.out.println("I  am waiting for loding to disappear after sliding left button");
		}
		
		sliders.dragAndDropBy(driver.findElement(By.xpath("//div[@id='angular_price_slider']/div/div[1]/div[3]")), -50, 0).build().perform();
		if(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("append_bottom12")))){
			System.out.println("I  am waiting for loding to disappear after sliding right button");
		}
		System.out.println("+++++++++ We move those BASTERDS successfully ++++++++++ Now it is time to validate the result");
		
		String startingPrice = driver.findElement(By.xpath("//div[@id='angular_price_slider']/p[2]/span[1]/span[2]")).getText();
		String endingPrice = driver.findElement(By.xpath("//div[@id='angular_price_slider']/p[2]/span[2]/span[2]")).getText();
		// calculate price range
		int startPrice= Integer.parseInt(startingPrice);
		int endPrice = Integer.parseInt(endingPrice);
		System.out.println("Start => "+ startingPrice + ", End => " + endingPrice);
		
		List<WebElement> ps = new ArrayList<WebElement>();
		ps = driver.findElements(By.xpath("//p[contains(@class,'actual_price text-right ng-binding')]"));
		System.out.println("We found : "+ps.size()+ " hotels in this price range");
		List<String> hotelPrice = new ArrayList<String>();
		List<Integer> prices = new ArrayList<Integer>();
		for(WebElement ele : ps){
			hotelPrice.add(ele.getText().split(" ")[1]);
			//System.out.println(ele.getText());
		}
		for(String p : hotelPrice){
			prices.add(Integer.parseInt(p));
		}
		boolean priceinRange = false;
		for(Integer p : prices){
			if(p>=startPrice && p<=endPrice){
				priceinRange = true;
			}else{
				priceinRange = false;
			}		
		}
		Assert.assertTrue(priceinRange == true, "Not in price range");
		Thread.sleep(3000);
		
		
		
		
		driver.quit();

	}


}
