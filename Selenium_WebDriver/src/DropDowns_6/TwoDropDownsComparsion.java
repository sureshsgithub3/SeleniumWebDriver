package DropDowns_6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwoDropDownsComparsion {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.id("txtSource")).sendKeys("Hyderabad");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtDestination")).sendKeys("Hyd");
		
		List<WebElement> auto=new ArrayList<WebElement>(driver.findElements(By.xpath(".//ul[@class='autoFill']/li")));
		int s= auto.size();
		
		for(WebElement ele:auto){
			System.out.println(ele.getText());
			
			if(ele.getText().contains("Hyderabad")){
				System.out.println("Test Pass");
			}else
				System.out.println("Test pass");
		}
		

	}

}
