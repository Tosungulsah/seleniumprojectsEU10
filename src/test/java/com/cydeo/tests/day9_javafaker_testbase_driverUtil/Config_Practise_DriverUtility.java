package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Config_Practise_DriverUtility {

    @Test
    public void google_search_test() throws InterruptedException {


        Driver.getDriver().get("https://www.google.com");
        Thread.sleep(1000);
        WebElement acceptButton= Driver.getDriver().findElement(By.xpath("//div[@class='QS5gu sy4vM']"));
        acceptButton.click();
        WebElement googleSearchBox= Driver.getDriver().findElement(By.xpath("//input[@name='q']"));




        // googleSearchBox.sendKeys("apple"+ Keys.ENTER);
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
        String expectedTitle=ConfigurationReader.getProperty("searchValue")+" - Google Search";
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle, "Title verification failed");
    }

}
