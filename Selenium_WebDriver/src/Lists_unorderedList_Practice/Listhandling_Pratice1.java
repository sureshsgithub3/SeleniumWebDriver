package Lists_unorderedList_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Listhandling_Pratice1 {
	/*
	 * steps
	 * open browser
	 * launch spice jet
	 * click on source
	 * get both india and internationsl kin to list
	 * get all the cities of both india and international in to list
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	
	
	
	
*/
	public static void main(String[] args) {
		WebDriver driver;
		driver= new FirefoxDriver();
		
		
		driver.get("http://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//click on source
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		/*get both India and international kin to list
		two types of cities are there India and international
		to store both India and international headings we are using list
		in this list we capture cities groups i.e India and international*/
		
		
		List<WebElement> city_type=new ArrayList<WebElement>(driver.findElements(By.xpath(".//table[@id='citydropdown']//h3")));
		int city_type_size=city_type.size();
		//printing size of list
		System.out.println("city_type_size :"+city_type_size);
		
		for(int i=1;i<=city_type_size;i++){
			/*storing groups in a webelement
			 * each grp have uls 
			 * */
			WebElement Flight_type=driver.findElement(By.xpath(".//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']/h3"));
			//List<WebElement> groups=driver.findElements(By.xpath(".//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']/h3"));
			//System.out.println(Flight_type.getText());
			
			
			/*storing no of uls of each group */
			List<WebElement> source_uls=new ArrayList<WebElement>(driver.findElements(By.xpath(".//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul/li")));
			int cities_unordered_list=source_uls.size();
			//System.out.println("cities in s_uls_li tags :"+cities_unordered_list);
			System.out.println(Flight_type.getText()+" Cities "+ cities_unordered_list );
			//System.out.println(groups.get(i).getText()+" Cities "+ cities_unordered_list );
			
		     for(int j=1 ;j<=cities_unordered_list;j++){
		    	 //storing li of each ul in a list
				List<WebElement> cities_uls=new ArrayList<WebElement>(driver.findElements(By.xpath(".//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul["+j+"]/li")));
				int size_of_lis=cities_uls.size();
				//System.out.println("Li's in Ul's :"+size_of_lis);
				for(int k=1;k<=size_of_lis;k++){
					/*
					 * Storing text of li's in the WebElement and priiting one by one
					*/
					//List<WebElement>City_in_U=driver.findElements(By.xpath(".//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul["+j+"]/li["+k+"]"));
					WebElement City_in_Ul=driver.findElement(By.xpath(".//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul["+j+"]/li["+k+"]"));
					
					System.out.println(City_in_Ul.getText());
					//System.out.println(City_in_U.get(k).getText());
				}
			}
			
			
			
			
		}
		
		driver.close();

	}

}
