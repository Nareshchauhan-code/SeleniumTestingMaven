package testcases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestFindingElements {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//String title = driver.getTitle();
		//title.length();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.withMessage("Element not found in 30 seconds")
				.ignoring(NoSuchElementException.class);
		
		driver.getTitle().length();
		
		/*
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("info@way2automation.com");
		
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		btn.click();
		*/
		driver.findElement(By.id("identifierId")).sendKeys("meetings@way2automation.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		//implicit wait and explicit wait
		//*[@id="password"]/div[1]/div/div[1]/input
		//Thread.sleep(5000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"))).sendKeys("sdfsdf");
		
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("sdfsdfds");
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
		System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span"))).getText());
	
		
		//	System.out.println(driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span")).getText());
		
		
		
	}

}
