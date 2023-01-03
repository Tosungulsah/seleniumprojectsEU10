package com.cydeo.tests.day5_DynamicWebElements_Testng;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {
    /*
    TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
        driver.navigate().to("https://practice.cydeo.com/add_remove_elements/");

        WebElement addElement=driver.findElement(By.xpath("//button[.='Add Element']"));

        Thread.sleep(2000);
        addElement.click();


        WebElement deleteBtn= driver.findElement(By.xpath("//button[@class='added-manually']"));

        System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());

        deleteBtn.click();

      //  deleteBtn=driver.findElement(By.xpath("//button[@class='added-manually']"));

       try {

               System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());
           }catch (StaleElementReferenceException e ){
           System.out.println("StaleElementReferenceException is thrown");
           System.out.println("Web element completely deleted");
           System.out.println("deleteBtn.isDisplayed() = true");
       }


    }
}
