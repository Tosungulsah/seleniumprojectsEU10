package com.cydeo.tests.day8_WebtablesCont_Properties;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {
WebDriver driver;
    @BeforeMethod
    public void setup() throws InterruptedException {
        String browserType= ConfigurationReader.getProperty("browser");




        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        WebElement acceptButton= driver.findElement(By.xpath("//div[@class='QS5gu sy4vM']"));
        acceptButton.click();
    }

    @Test
    public void google_search_test(){
        WebElement googleSearchBox= driver.findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        Assert.assertEquals(driver.getTitle(),"apple - Google Search", "Title verification failed");
}
}
