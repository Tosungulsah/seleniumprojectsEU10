package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Yahoo {
    public static void main(String[] args) {

        //1 setting up the webdriver
        WebDriverManager.chromedriver().setup();
        //2 open instance chrome browser
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // 3 if the driver is working as expected

        driver.get("https://uk.yahoo.com/?p=us&guccounter=1");

        String actualTitle= driver.getTitle();

        System.out.println("currentlyTitle = " + actualTitle);


        String expectedTitle="Yahoo UK | News, email and search";

       if(actualTitle.equals(expectedTitle)){
           System.out.println("Title is expected.");
       }else{
           System.out.println("Title is not expected");
       }


       //driver.close();



    }
}
