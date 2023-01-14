package com.cydeo.tests.day8_WebtablesCont_Properties;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_warmup {
    /*
    TC #1: Web table practice
   */
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    //1. Go to: https://practice.cydeo.com/web-tables
    @Test
    public void tablePractice(){
        driver.get("https://practice.cydeo.com/web-tables");
       // 2. Verify Bob’s name is listed as expected. Expected: “Bob Martin”
        WebElement bobsNameLocate= driver.findElement(By.xpath("//table[@class='SampleTable']//tr[7]//td[2]"));
        String actualBobsname= bobsNameLocate.getText();
        System.out.println("actualBobsname = " + actualBobsname);
        String expectedBobsname= "Bob Martin";
        Assert.assertEquals(actualBobsname,expectedBobsname,"Bob's name verification failed");

    //Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021

        WebElement bobsDate= driver.findElement(By.xpath("//table[@class='SampleTable']//tr[7]//td[5]"));
        String actualDate= bobsDate.getText();
        System.out.println("actualDate = " + actualDate);
        String expectedDate= "12/31/2021";
        Assert.assertEquals(actualDate,expectedDate,"Date verification failed");

    }

}
