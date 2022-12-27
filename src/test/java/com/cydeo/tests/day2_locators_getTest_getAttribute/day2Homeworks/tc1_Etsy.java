package com.cydeo.tests.day2_locators_getTest_getAttribute.day2Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1_Etsy {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.etsy.com");

        WebElement acceptingRules= driver.findElement(By.xpath("//*[@id=\"gdpr-single-choice-overlay\"]/div/div[2]/div[2]/button"));
        acceptingRules.click();

        Thread.sleep(3000);
       // WebElement searchtab= driver.findElement(By.id("global-enhancements-search-query"));
        //searchtab.click();

        Thread.sleep(3000);
        WebElement searching= driver.findElement(By.name("search_query"));

        searching.sendKeys("Wooden Spoon"+ Keys.ENTER);

        String expectedTitle= "Wooden spoon | Etsy";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
    }
}
