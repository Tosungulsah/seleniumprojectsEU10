package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1 setup browser
        WebDriverManager.chromedriver().setup();

        // 2-create instance of the selenium webdriver
      // this is the line opening an empty browser
        WebDriver driver= new ChromeDriver();

        // this makes window maximize

        driver.manage().window().maximize();

       // driver.manage().window().fullscreen(); // sometimes can not work , its normaly for mac user



        // 3 go to the " https://www.tesla.com"
        driver.get("https://www.tesla.com");

      // stop code execution for 3 seconds
        Thread.sleep(3000);

        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        // use selenium to navigate back
        driver.navigate().back();

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        // navigate to method
        driver.navigate().to("https://www.google.com");

        currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        // get the title from page
        //System.out.println("driver.getTitle() = " + driver.getTitle());

        // currrent URl
        String currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // this one close this
        driver.close();
        // this close all extra pages
        driver.quit();
    }
}
