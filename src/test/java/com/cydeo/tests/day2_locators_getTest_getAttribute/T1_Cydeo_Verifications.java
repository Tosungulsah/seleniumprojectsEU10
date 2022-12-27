package com.cydeo.tests.day2_locators_getTest_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Cydeo_Verifications {

    public static void main(String[] args) {
        // 1- setup browser
        WebDriverManager.chromedriver().setup();
        // open empty browser
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        // verify URL contains
        //expected : cydeo
        String expectedUrl="cydeo";
        String actualURL= driver.getCurrentUrl();

        if(actualURL.contains(expectedUrl)){
            System.out.println("Url passed");
        }else{
            System.out.println("Url failed");
        }

        String expectedTitle= "Practice";
        String actualTitle=driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification passed.");
        }else{
            System.out.println("Title verification failed");
        }

        driver.close();



    }
}
