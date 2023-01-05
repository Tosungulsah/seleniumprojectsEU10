package com.cydeo.tests.day6_Alerts_Iframes_Window;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Selecting_State {
    //TC #5: Selecting state from State dropdown and verifying result


//6. Verify
   // final selected option is California.
    //Use all Select options. (visible text, value, index)

    WebDriver driver;
    //1. Open Chrome browser
    @BeforeMethod
    public void setupMethod(){
        //do browser driver setup
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
   // @AfterMethod
   // public void tearDown(){
       // driver.close();
   // }

    //2. Go to http://practice.cydeo.com/dropdown


//5. Select California

    @Test
    public void dropdown() throws InterruptedException {
        driver.navigate().to("http://practice.cydeo.com/dropdown");

        Select stateDropDown= new Select(driver.findElement(By.xpath("//select[@id='state']")));


        // 3. Select Illinois
        Thread.sleep(1000);
        stateDropDown.selectByVisibleText("Illinois");

        //4. Select Virginia
        Thread.sleep(1000);
        stateDropDown.selectByValue("VA");
        //5. Select California
        Thread.sleep(1000);
        stateDropDown.selectByIndex(5);

        String expectedOptionText= "California";
        String actualOptionText= stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptionText,expectedOptionText,"Drop dorn selection verification failed");

    }

}
