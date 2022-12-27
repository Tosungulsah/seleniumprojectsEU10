package com.cydeo.tests.day2_locators_getTest_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");

        WebElement clickAccept= driver.findElement(By.id("L2AGLb"));
        clickAccept.click();

        WebElement googleSearchBox= driver.findElement(By.name("q"));

        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        // verify title

        String expectedInTitle= "apple";
        String actualTitle= driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }



        //driver.close();

    }
}
