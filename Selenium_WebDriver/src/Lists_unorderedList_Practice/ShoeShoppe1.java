package Lists_unorderedList_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShoeShoppe1 {

	public static void main(String[] args) {
		
		
		
		WebDriver driver;
		driver= new FirefoxDriver();
		driver.get("http://182.72.246.195:8088/");
		
		
		List<WebElement> Shoes_for=driver.findElements(By.xpath("//*[@id='block_top_menu']/ul/li"));
		int size1=Shoes_for.size();
		
		for(int i=1;i<=size1;i++){
			// it is storing in web WebElement and its xpath incremented in each iteration
			WebElement ShoesFor_types=driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li["+i+"]"));
			System.out.println(ShoesFor_types.getText());
			
			//Storing all types of foot wear  in a list
			List<WebElement>Footwr_type=driver.findElements(By.xpath(".//*[@id='block_top_menu']/ul/li["+i+"]/ul/li/a"));
			int size2=Footwr_type.size();
			
			
			for(int j=1;j<=size2;j++){
				WebElement Footwr_type_text=driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li["+i+"]/ul/li["+j+"]/a"));
				//int size3=Footwr_type_text.size();
				String f_t_text=Footwr_type_text.getAttribute("title");
				System.out.println(f_t_text);
				List<WebElement> categories=driver.findElements(By.xpath(".//*[@id='block_top_menu']/ul/li["+i+"]/ul/li["+j+"]/ul/li/a"));
				int size3=categories.size();
				
				for(int k=1;k<=size3;k++){
					//storing all foot wear categories
					WebElement categories_types=driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li["+i+"]/ul/li["+j+"]/ul/li["+k+"]/a"));
					//getting text of li
					String categories_types_text=categories_types.getAttribute("title");
					System.out.println(categories_types_text);
				}
			}
		}
		System.out.println("            ");
		driver.close();
		
		

	}

}
