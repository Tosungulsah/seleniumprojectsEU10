package com.cydeo.tests.day_13_review_practises;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_ExplicitWaitPractise {
    //TC #2: Explicit wait practice
    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/dynamic_controls

    DynamicControlsPage dynamicControlsPage;
    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");

         dynamicControlsPage= new DynamicControlsPage();
    }



    //3- Click to “Remove” button
    @Test
    public void remove_button_test() {
        dynamicControlsPage.removeButton.click();

        //4- Wait until “loading bar disappears”
//        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingButton);
        //5- Verify:

        // a. Checkbox is not displayed
        try {
            //assertFalse method will pass the test if the boolean value returned is: false
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Assert.assertTrue(!dynamicControlsPage.checkBox.isDisplayed());
            Assert.assertFalse(dynamicControlsPage.checkBox.isDisplayed());
            Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }
        // b. “It’s gone!” message is displayed.

        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));


    }
    @Test
    public void enableButtonTest(){
       // 3- Click to “Enable” button
        dynamicControlsPage.enableButton.click();
       // 4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingButton);

        System.out.println("dynamicControlsPage.inputBox.isEnabled() = "
                + dynamicControlsPage.inputBox.isEnabled());
       // 5- Verify:

       // a. Input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());
       // b. “It’s enabled!” message is displayed.
        System.out.println("dynamicControlsPage.message = " + dynamicControlsPage.message.getText());
        Assert.assertEquals(dynamicControlsPage.message.getText(),"It's enabled!");

    }
}
