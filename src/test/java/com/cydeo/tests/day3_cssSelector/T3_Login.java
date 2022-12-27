package com.cydeo.tests.day3_cssSelector;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_Login {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.navigate().to("https://login1.nextbasecrm.com/");
//<input type="submit" value="Log In" class="login-btn" onclick="BX.addClass(this, 'wait');">
        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
         String actualLoginButton=   loginButton.getAttribute("value");
        String expectedLoginButton= "Log In";

        if(actualLoginButton.equals(expectedLoginButton)){
            System.out.println("Login button text passed");
        }else{
            System.out.println("Login button text failed");
        }
    }
}
