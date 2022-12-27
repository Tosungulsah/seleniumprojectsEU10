package com.cydeo.tests.day2_locators_getTest_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_Cydeo_GetText_GetAttiribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com/registration_form");

        WebElement headerText=driver.findElement(By.tagName("h2"));
        String expectedHeaderText="Registration form";

        String actualHeaderText= headerText.getText();

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text passed");
        }else{
            System.out.println("Header text failed");
        }

        //locate firs name input

        WebElement firstNameInput= driver.findElement(By.name("firstname"));

        // verify placeholder attribute value is as expected
        // first name
        String expectedPlaceHolder= "first name";
        String actualPlaceHolder= firstNameInput.getAttribute("placeholder");
        if(actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder verification passed ");
        }else{
            System.out.println("Placeholder verification failed");
        }





    }
}
