package Lists_UnorderedLists;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ShoeShopeLists {

	public static void main(String[] args) {
		WebDriver driver;
		driver= new FirefoxDriver();
		
		
		driver.get("http://182.72.246.195:8088/");
		
		//getting categories into list
		List<WebElement> options= new ArrayList<WebElement>(driver.findElements(By.xpath(".//*[@id='block_top_menu']/ul/li/a")));
		//finding size of the options
		int s1= options.size();
		System.out.println(s1);
		
		for(int i=1;i<=s1;i++){
			
			WebElement ele=driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li["+i+"]/a"));
			
			System.out.println(ele.getText());
			System.out.println("=================>>><<<<<==========");
			
			List<WebElement> ele1=new ArrayList<WebElement>(driver.findElements(By.xpath("//*[@id='block_top_menu']/ul/li["+i+"]/ul/li/a")));
			for(int j=1;j<=ele1.size();j++){
				WebElement subelement=driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li["+i+"]/ul/li["+j+"]/a"));
				System.out.println(ele.getText()+" sub categories  " + subelement.getAttribute("title"));
				
				List<WebElement> ele2=new ArrayList<WebElement>(driver.findElements(By.xpath("//*[@id='block_top_menu']/ul/li["+i+"]/ul/li["+j+"]/ul/li/a")));
				
				for(int k=1;k<=ele2.size();k++){
					WebElement type_of_Footwear=driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li["+i+"]/ul/li["+j+"]/ul/li["+k+"]/a"));
					System.out.println(ele.getText()+" sub categories  " + subelement.getAttribute("title")+"Footwear are :"+type_of_Footwear.getAttribute("title"));
				}
				
				
				
			}
			
			
			
			
			
			
			
		}
		
		
		

	}

}
