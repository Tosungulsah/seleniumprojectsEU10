package com.cydeo.tests.day2_locators_getTest_getAttribute.day2Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc2_zerobank {
    // TC #2: Zero Bank header verification
    //1. Open Chrome browser
    //2. Go to http://zero.webappsecurity.com/login.html
    //3. Verify header text
    //Expected: “Log in to ZeroBank”

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        // verifying header text

        String expectedHeader= "Log in to ZeroBank";

        WebElement header3= driver.findElement(By.tagName("h3"));
        String actualHeader= header3.getText();

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header verification passed.");
        }else{
            System.out.println("Header verification failed.");
        }


    }


}
