package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WindowsHandles {

    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().deleteAllCookies();
        webDriver.get("https://www.browserstack.com/");
        System.out.println(webDriver.getTitle());
        webDriver.findElement(By.xpath("//*[@id=\"promo-notification\"]/div/div/p/a[1]")).click();

        List<String> windows = new ArrayList<String>(webDriver.getWindowHandles());

        webDriver.switchTo().window(windows.get(1));

        System.out.println(webDriver.getTitle());

        webDriver.quit();

    }
}
