package com.cydeo.tests.day5_DynamicWebElements_Testng;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButtonHandling {
   // TC #2: Radiobutton handling
//1. Open Chrome browser

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //2. Go to https:practice.cydeo.com/radio_buttons

        driver.navigate().to("https://practice.cydeo.com/radio_buttons");
      //  3. Click to “Hockey”radio button
        WebElement hockeyBtn= driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyBtn.click();
        // 4. Verify “Hockey”radio button is selected after clicking.
        System.out.println("hockeyBtn.isSelected() = " + hockeyBtn.isSelected());
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

    }
}
