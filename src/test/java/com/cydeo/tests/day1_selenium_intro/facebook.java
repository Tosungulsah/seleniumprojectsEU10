package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
    public static void main(String[] args) {
        //  1-  setting up new driver manager
        WebDriverManager.chromedriver().setup();

        // 2- create instance of chrome driver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //3- Test if driver is working as expected
        driver.get("https://www.facebook.com/");

        String actualTitle= driver.getTitle();

        String expectedTitle= "Facebook – log in or sign up";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
