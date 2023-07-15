package com.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakesScreenShot {

    @Test
    void browserLaunch() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Launch Browser
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Welcome to Selenium");
        // Take the Screen shot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File out = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(out, new File(".test.png"));

        // Quit the Driver
        driver.quit();
    }
}
