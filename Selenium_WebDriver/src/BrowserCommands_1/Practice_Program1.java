/**
 * 
 */
package BrowserCommands_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author suresh
 *
 */
public class Practice_Program1 {
	
	static WebDriver driver;

	
	public static void main(String[] args) {
		// Create a new instance of the FireFox driver
		driver = new FirefoxDriver();
		
		String path="http://www.store.demoqa.com";
		
		driver.get(path);
		
		//storing title and length
		
		String title= driver.getTitle();
		int length= driver.getTitle().length();
		//printing title and its length
		System.out.println("page title is :"+title);
		System.out.println("page title length: "+length);
		
		
		
		
		//storing current url;
		String url= driver.getCurrentUrl();
		
		if(path.equals(url)){
			System.out.println("correct url");
		}
		else{
			System.out.println("Verification failed ");
			System.out.println(path);
			System.out.println(url);
		}
		//storing page source
		String pagesource= driver.getPageSource();
		
		//storing page source length in int variable
		
		int pagesourcelength=driver.getPageSource().length();
		
		System.out.println("page source is :"+pagesource);
		System.out.println("page source is :"+pagesourcelength);
		
		//closing browser
		
		driver.close();
		
		

	}

}
