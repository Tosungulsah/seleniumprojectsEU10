package com.cydeo.tests.day4_FindElements_CheckBox_Radio;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_CssSelector_practice {
    public static void main(String[] args) {
/*
XPATH and CSS Selector PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
 */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


//2. Go to https://practice.cydeo.com/forgot_password
        driver.navigate().to("https://practice.cydeo.com/forgot_password");
//3. Locate all the WebElements on the page using XPATH and/or CSS

//locator only (total of 6)
//a. “Home” link
        WebElement home = driver.findElement(By.cssSelector("a[class='nav-link']"));

//b. “Forgot Password” header
        WebElement forgotPassword= driver.findElement(By.cssSelector("div.example > h2"));

        //System.out.println("forgotPasswordHeader = " + forgotPasswordHeader);

        String expectedForgotpassword= "Forgot Password";
        String forgotPasswordHeader= forgotPassword.getText();
        System.out.println(forgotPasswordHeader);
        if(forgotPasswordHeader.equals(expectedForgotpassword)){
            System.out.println("Forgot Password Header Passed");
        }else{
            System.out.println("Forgot Password Header Failed");
        }
//c. “E-mail” text
        WebElement emailText= driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println("E-mail Text= "+ emailText.getText());

        String actualemailText= emailText.getText();
        String expectedemailText= "E-mail";

        if(actualemailText.equals(expectedemailText)){
            System.out.println("E- mail text verification passed");
        }else{
            System.out.println("E- mail text verification failed");
        }

//d. E-mail input box
        WebElement emailInput= driver.findElement(By.xpath("//input[contains(@pattern,'a-z0-9.')]"));


//e. “Retrieve password” button
        WebElement retrievePassword= driver.findElement(By.xpath("//button[@id='form_submit']"));

//f. “Powered by Cydeo text
        WebElement CydeoText= driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        //4. Verify all web elements are displayed.
        System.out.println("home.isDisplayed() = " + home.isDisplayed());
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("CydeoText.isDisplayed() = " + CydeoText.isDisplayed());



//First solve the task with using cssSelector only. Try to create 2 different

//cssSelector if possible

//Then solve the task using XPATH only. Try to create 2 different
//XPATH locator if possible





    }
}
