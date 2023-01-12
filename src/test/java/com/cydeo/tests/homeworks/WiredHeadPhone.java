package com.cydeo.tests.homeworks;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WiredHeadPhone {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test
    public void wiredHeadPhone() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        WebElement cross= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

        cross.click();

    }
}
