package WebTables_Pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OnlyTesting {

	public static void main(String[] args) {
		WebDriver driver;
		driver= new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//locate table
		WebElement table= driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/table/tbody"));
		
		List<WebElement>rows=driver.findElements(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/table/tbody/tr"));
		int rowsize=rows.size();
		System.out.println("rowsize "+rowsize);
		
		 //Loop will execute till the last row of table.
		for(int i=1;i<=rowsize;i++){
			WebElement Table_rows=driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/table/tbody/tr["+i+"]"));
			//System.out.println(Table_rows.getText());
			List<WebElement>row_columns=driver.findElements(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/table/tbody/tr["+i+"]/td"));
			   int columns_size=row_columns.size();
			
			for(int j=1;j<=columns_size;j++){
				WebElement cellText=	driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/table/tbody/tr["+i+"]/td"));
				 //To retrieve text from that specific cell.
				String celltext=cellText.getText();
				 System.out.print(celltext);
				
			}
		}

	}

}
