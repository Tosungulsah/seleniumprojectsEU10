package com.cydeo.tests.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TitleVerification {
    public static void titleVerify(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(),expectedTitle,"Title verification failed");
    }
}
