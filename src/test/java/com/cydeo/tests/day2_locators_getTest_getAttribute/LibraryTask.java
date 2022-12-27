package com.cydeo.tests.day2_locators_getTest_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibraryTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");

        Thread.sleep(2000);
        WebElement emailAddress = driver.findElement(By.className("form-control"));
        emailAddress.sendKeys("xxx@gmail.com");

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("444512ee");

        WebElement signinButton= driver.findElement(By.tagName("button"));
        signinButton.click();

        // verify message

      //  String expectedError = "Sorry, Wrong Email or Password";
       // String actualError= driver.findElement(By.className("alert alert-danger")).getText();

/*
        System.out.println(actualError);
        if(expectedError.equals(actualError)){
            System.out.println("Error message verification passed");
        }else{
            System.out.println("Error message verification failed");
        }

*/






    }
}
