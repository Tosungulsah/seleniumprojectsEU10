package com.cydeo.tests.day6_Alerts_Iframes_Window;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe_Practice {
    /*
    TC #4: Iframe practice
 1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
    */
    WebDriver driver;

    @BeforeMethod

    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://practice.cydeo.com/iframe");

    }

    @Ignore
    @Test
    public void iframePractice() {

        driver.switchTo().frame("mce_0_ifr");

        WebElement yourcontent = driver.findElement(By.xpath("//p"));
        System.out.println(yourcontent.getText());

        Assert.assertTrue(yourcontent.isDisplayed());
        driver.switchTo().parentFrame();

    }

    @Test
    public void windowHandle_practice() {
        /*
        TC #5: Window Handle practice

1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
         */

        //3. Go to : https://practice.cydeo.com/windows
        driver.navigate().to("https://practice.cydeo.com/windows");
        String mainhandle = driver.getWindowHandle();
        System.out.println("mainhandle = " + mainhandle);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("before clicking actualTitle = " + actualTitle);
        WebElement clickHere = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click();
        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+ driver.getTitle() );
        }
        System.out.println("after clicking  "+ driver.getTitle());
    }

}