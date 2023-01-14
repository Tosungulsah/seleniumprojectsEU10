package com.cydeo.tests.homeworks;

import com.cydeo.tests.utilities.TitleVerification;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExampleTitleVerification {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com/");
    }
    @Test
    public void verifyGoogleTitle(){
        TitleVerification.titleVerify(driver,"Google");

    }

}
