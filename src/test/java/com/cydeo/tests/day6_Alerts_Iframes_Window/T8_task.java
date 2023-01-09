package com.cydeo.tests.day6_Alerts_Iframes_Window;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_task {
    /*
    TC #8: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values.

     */

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void multipleSelect() throws InterruptedException {
        WebElement languages= driver.findElement(By.xpath("//select[@name='Languages']") );


        Select multiselect= new Select(languages);
     //    multiselect.selectByValue();
        List<WebElement> allOptions = multiselect.getOptions();

        for (WebElement each : allOptions) {
            each.click();

            
        }

        Thread.sleep(3000);
        for (WebElement each : allOptions) {
            each.click();
        }
        }



            
    }

