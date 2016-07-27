package Lists_unorderedList_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Flipkart_Uls {

	public static void main(String[] args) {
		WebDriver driver;
		driver= new FirefoxDriver();
		
		driver.get("http://www.flipkart.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		List<WebElement> Categiries =driver.findElements(By.xpath("//div[@id='container']//ul[@class='_114Zhd required-tracking']/li"));
		int size1=Categiries.size();
		System.out.println(size1);
		
		for(int i=1;i<=size1;i++){
			//storing text categories to webelement and priting 
			WebElement Categiries_text=driver.findElement(By.xpath("//div[@id='container']//ul[@class='_114Zhd required-tracking']/li["+i+"]/a"));
			System.out.println("Flipart_Categiries  :"+Categiries_text.getText());
			System.out.println("-------------------------");
			
		
			List<WebElement> Sub_Cate=driver.findElements(By.xpath("//div[@id='container']//ul[@class='_114Zhd required-tracking']/li["+i+"]//ul["+i+"]//li[@class='_1KCOnI kqQgE5 _1h5QLb']"));
			int size2=Sub_Cate.size();
			System.out.println("size2 "+size2);
			    for(int j=1;j<=size2;j++){
				
			   // List<WebElement> subCateries_text= driver.findElements(By.xpath("//div[@id='container']//ul[@class='_114Zhd required-tracking']/li["+i+"]//ul["+i+"]//li[@class='_1KCOnI kqQgE5 _1h5QLb']"));
			    
			              
			            WebElement	 subCateries_text1= driver.findElement(By.xpath("//div[@id='container']//ul[@class='_114Zhd required-tracking']/li["+i+"]//ul["+i+"]//li[@class='_1KCOnI kqQgE5 _1h5QLb']//a"));
				          if(i==1){
					      System.out.println("SubCategories "+subCateries_text1.getAttribute("title"));
					      System.out.println("----------------------------");
				                  }
			    
			                                      }
			                             
		                         }
		
		
		
		
		
	driver.close();

	}

}
