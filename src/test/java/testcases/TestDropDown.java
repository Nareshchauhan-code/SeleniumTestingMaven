package testcases;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		//driver.findElement(By.id("searchLanguage")).sendKeys("Eesti");
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Eesti");
		select.selectByValue("hi");
		
	
		
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		
		System.out.println(values.size());
		
		System.out.println(values.get(values.size()-2).getText());
		System.out.println(values.get(values.size()-2).getAttribute("value"));
		
		
		
		for(int i=0; i<values.size(); i++) {
			
			System.out.println(values.get(i).getAttribute("lang"));
			
			
		}
		
		driver.findElements(By.id("abc")).get(1).click();
		
		
		System.out.println("-----Printing links-----");
		
		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]"));
		
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		
		for(WebElement link: links) {
			
			System.out.println(link.getText()+"----URL is :"+link.getAttribute("href"));
			
			
		}
		
		
		
		
	}

}
