package com.cydeo.tests.day4_FindElements_CheckBox_Radio;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC4_FindElementsTask {
    public static void main(String[] args) {


       // TC #4: FindElements Task
//1- Open a chrome browser

WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
// Go to: https://practice.cydeo.com/abtest

        driver.navigate().to("https://practice.cydeo.com/abtest");
// Locate all the links in the page.
      List<WebElement> alllinks= driver.findElements(By.tagName("a"));
// Print out the number of the links on the page.
        System.out.println("alllinks.size() = " + alllinks.size());

// Print out the texts of the links.
        for (WebElement alllink : alllinks) {
            System.out.println("Text of link :"+ alllink.getText());

// Print out the HREF attribute values of the links
            System.out.println("Href values :"+ alllink.getAttribute("href"));

        }









    }
}
