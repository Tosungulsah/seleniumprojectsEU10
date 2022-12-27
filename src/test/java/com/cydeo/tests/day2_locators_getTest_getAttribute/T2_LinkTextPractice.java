package com.cydeo.tests.day2_locators_getTest_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {
        //1 setup browser
        WebDriverManager.chromedriver().setup();

        // 2-create instance of the selenium webdriver
        // this is the line opening an empty browser
        WebDriver driver= new ChromeDriver();

        // this makes window maximize

        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com");
        Thread.sleep(2000);
        //click to A/B Testing from top of the List
       //   driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink= driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        Thread.sleep(2000);
        //verify title
        String expectedTitle="No A/B Test";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }

        driver.navigate().back();


       expectedTitle= "Practice";
       actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }







    }
}
