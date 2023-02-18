package com.cydeo.tests.day12_Pom;

import com.cydeo.pages.Dynamic_Load1;
import com.cydeo.pages.Dynamic_Title;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractices {
    @Test
    public void dynamic_load_7_test(){
       // 1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
       // 2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

        //use the "wait " object to
         wait.until(ExpectedConditions.titleContains("Dynamic title"));

        Dynamic_Title dynamic_title=new Dynamic_Title();

        // 3. Assert: Message “Done” is displayed.
       Assert.assertTrue(dynamic_title.doneMessage.isDisplayed());
       // 4. Assert: Image is displayed.
        Assert.assertTrue(dynamic_title.image.isDisplayed());

    }

    @Test
    public void dynamic_load_1_test(){
        //C#5 : Dynamically Loaded Page Elements 1
        //1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");


        Dynamic_Load1 dynamic_load1= new Dynamic_Load1();

        //2. Click to start
        dynamic_load1.startButton.click();


       // 3. Wait until loading bar disappears
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.invisibilityOf(dynamic_load1.loadingBar));
        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamic_load1.userInput.isDisplayed());
       // 5. Enter username: tomsmith
        dynamic_load1.userInput.sendKeys("tomsmith");
       // 6. Enter password: incorrectpassword
        dynamic_load1.passwordInput.sendKeys("dsdsdsd");
       // 7. Click to Submit button
        dynamic_load1.submitButton.click();
       // 8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamic_load1.errorMessage.isDisplayed());

    }
}
