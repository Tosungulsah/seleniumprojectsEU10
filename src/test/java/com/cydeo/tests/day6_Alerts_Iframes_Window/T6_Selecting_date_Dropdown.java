package com.cydeo.tests.day6_Alerts_Iframes_Window;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_Selecting_date_Dropdown {

    /*
    TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
Select year using  : visible text
Select month using   : value attribute
Select day using : index number
     */

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
/*
    @AfterMethod
    public void close(){
        driver.close();
    }
*/
    @Test
    public void verifying() throws InterruptedException {
        driver.navigate().to("https://practice.cydeo.com/dropdown");
        Thread.sleep(3000);
        //3. Select “December 1st, 1923” and verify it is selected.
        Select yearDropdown= new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropdown.selectByValue("1924");
        Thread.sleep(3000);
        Select monthDropDown= new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropDown.selectByVisibleText("December");
        Thread.sleep(3000);
        Select dayDropDown= new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropDown.selectByIndex(0);

        String expectedYear= "1924";
        String actualYear= yearDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualYear,expectedYear,"year verification failed");

        String expectedMonth= "December";
        String actualMonth= monthDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualMonth,expectedMonth,"Month verification failed");

        String expectedDay= "1";
        String actualDay= dayDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDay,expectedDay,"day verification failed");

    }
}
