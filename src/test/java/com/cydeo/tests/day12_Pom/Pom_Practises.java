package com.cydeo.tests.day12_Pom;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pom_Practises {
    LibraryLoginPage libraryLoginPage;
    @Test
    public void requiered_fireld_error_message_test(){
/*
TC #1: Required field error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
*/
        Driver.getDriver().get("https://library1.cydeo.com");

        /*
3- Do not enter any information

4- Click to “Sign in” button
*/
        libraryLoginPage= new LibraryLoginPage();
        libraryLoginPage.signInButton.click();

        /*
5- Verify expected error is displayed:
Expected: This field is required.

 */
        Assert.assertTrue(libraryLoginPage.fieldRequeredErrorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void invalid_email_format_error_message_test(){
/*
TC #2: Invalid email format error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
*/
    Driver.getDriver().get("https://library1.cydeo.com");

//3- Enter invalid email format
    libraryLoginPage= new LibraryLoginPage();
    libraryLoginPage.inputUsername.sendKeys("sdsdksjksj");
    libraryLoginPage.signInButton.click();
    Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());


/*
4- Verify expected error is displayed:
Expected: Please enter a valid email address.

NOTE: FOLLOW POM DESIGN PATTERN
 */




    }

    @Test
    public void library_negative_login_test(){

/*

TC #3: Library negative login
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
*/
        Driver.getDriver().get("https://library1.cydeo.com ");
//3- Enter incorrect username or incorrect password
        libraryLoginPage= new LibraryLoginPage();
        libraryLoginPage.inputUsername.sendKeys("dfdhk@gmail.com");
        libraryLoginPage.inputPassword.sendKeys("hdddj");
        libraryLoginPage.signInButton.click();
//4- Verify title expected error is displayed:
        BrowserUtils.sleep(2);
        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordMessage.isDisplayed());
//Expected: Sorry, Wrong Email or Password

        Assert.assertEquals(libraryLoginPage.wrongEmailOrPasswordMessage,"Sorry, Wrong Email or Password");




    }

}
