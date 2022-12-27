package com.cydeo.tests.day3_cssSelector;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getAttribute {
    public static void main(String[] args) {
        /*
        TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes


         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement remembermeLabel= driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMe= "Remember me on this computer";
        String actualRememberMe=remembermeLabel.getText();
        System.out.println(actualRememberMe);

        if(actualRememberMe.equals(expectedRememberMe)){
            System.out.println("Remember me text verification passed");
        }else{
            System.out.println("Remember me text verification failed");
        }

        WebElement forgotPassword= driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotpasswordLinktext= "Forgot your password?";
        String actualForgotPasswordLinktext=forgotPassword.getText();

            if(actualForgotPasswordLinktext.equals(expectedForgotpasswordLinktext)){
                System.out.println("Forgot password text passed");
            }else{
                System.out.println("Forgot password text failed");
            }

            String expectedHref= "forgot_password=yes";
            String actualhref= forgotPassword.getAttribute("href");

        System.out.println(actualhref);
            if(actualhref.contains(expectedHref)) {
                System.out.println("Href value verification passed");
            }else{
                System.out.println("Href value verification failed");
            }
    }
}
