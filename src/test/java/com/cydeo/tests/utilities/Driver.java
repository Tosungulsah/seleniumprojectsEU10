package com.cydeo.tests.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver{
    /*
    Creating a private constructor
    so we are closing access to the
    object of this class from outside the class

     */
    private Driver(){}
    //we make webdriver private, because we want to close access from outside of the class
  //  we make it static because we will use it  in static method
    private static WebDriver driver;
    /*
        Create re-usable utility method which will return same driver instance when we call it
         */
    public static WebDriver getDriver(){
        if(driver==null){
            String browserType= ConfigurationReader.getProperty("browser");
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
            return driver;
    }

}
