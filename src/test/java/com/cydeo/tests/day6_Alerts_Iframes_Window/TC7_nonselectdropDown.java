package com.cydeo.tests.day6_Alerts_Iframes_Window;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC7_nonselectdropDown {
    /*
    TC #7: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”

     */

    WebDriver driver;
    @BeforeMethod
    public void setup() throws InterruptedException {
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://practice.cydeo.com/dropdown");
        Thread.sleep(3000);
    }
    @Test

    public void nonSelect() throws InterruptedException {
        WebElement clickDropdown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        clickDropdown.click();
       Thread.sleep(1000);
        WebElement facebook= driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
        facebook.click();
       WebElement acceptFace= driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
       acceptFace.click();
       String expectedTitle= "Facebook – log in or sign up";
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),expectedTitle,"Title verification failed");
    }

    }

