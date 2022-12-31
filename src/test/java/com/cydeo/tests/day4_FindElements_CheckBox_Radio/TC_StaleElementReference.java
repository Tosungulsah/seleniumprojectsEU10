package com.cydeo.tests.day4_FindElements_CheckBox_Radio;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_StaleElementReference {
    public static void main(String[] args) {
      //  TC #6: StaleElementReferenceException Task

       // 1- Open a chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
       // 2- Go to: https://practice.cydeo.com/abtest
        driver.navigate().to("https://practice.cydeo.com/abtest");
       // 3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
        // 4- Refresh the page.
        driver.navigate().refresh();

        //reassigning, relocating  so we dont get stale error .
        cydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));
        // 5- Verify it is displayed, again.
        System.out.println("cydeoLink.isDisplayed() second time = " + cydeoLink.isDisplayed());


    }
}
