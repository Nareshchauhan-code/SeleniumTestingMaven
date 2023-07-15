package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class IsDispalyedTest {

    @Test
    void browserLaunch() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Launch Browser

        driver.get("https://demo.nopcommerce.com/");
        WebElement element = driver.findElement(By.xpath("//input[@id ='small-searchterms']"));

        System.out.println("The Element is Enabled : " + element.isEnabled());
        System.out.println("The Element is Displayed : " + element.isDisplayed());


        driver.quit();
    }
}
