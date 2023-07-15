package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	
	
	public static String browser = "chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		
		if(browser.equals("chrome")) {
			
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			
			driver = new FirefoxDriver();
		}

		//CTRL + SHIFT + O
		
		driver.get("http://gmail.com");

		//1233
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);
		
		String expectedTitle = "Google.com";
		
		
		
		if(expectedTitle.equals(title)) {
			
			System.out.println("Test case pass");
		}else {
			
			System.out.println("Test case fail");
		}
		
		
		//driver.close();
		driver.quit();
		
		
		
		
		
		

	}

}
