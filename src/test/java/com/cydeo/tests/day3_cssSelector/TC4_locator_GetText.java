package com.cydeo.tests.day3_cssSelector;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4_locator_GetText {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

/*
TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        //<button class="login-btn" value="Reset password" onclick="BX.addClass(this, 'wait');">Reset password</button>

        WebElement resetPassword= driver.findElement(By.cssSelector("button[value='Reset password']"));
        String actualResetPassword= resetPassword.getAttribute("value");
        String expectedResetPassword="Reset password";

        if(actualResetPassword.equals(expectedResetPassword)){
            System.out.println("Reset password button text verification passed");
        }else {
            System.out.println("Reset password button text verification failed");
        }

    }
}
