package com.cydeo.tests.day5_DynamicWebElements_Testng;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Testng_Selenium {

    WebDriver driver;
    @BeforeMethod
        public void setupMethod(){
        //do browser driver setup
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void selenium_test(){

        // //Get "https://google.com"
            driver.get("https://google.com");
            //Assert: title is  "Google"
        Assert.assertEquals(driver.getTitle(),"Google","Title verification failed");

        }
    }

