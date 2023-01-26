package com.cydeo.tests.day10_uploads_actions_jsexecuter;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {
    /*
    TC#1: Registration form confirmation
Note: Use JavaFaker OR read from configuration.properties file when possible.
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10. Enter date of birth
11. Select Department/Office
12. Select Job Title
13. Select programming language from checkboxes
14. Click to sign up button
15. Verify success message “You’ve successfully completed registration.” is
displayed.


Note:
1. Use new Driver utility class and method
2. User JavaFaker when possible
3. User ConfigurationReader when it makes sense
     */

    @Test
    public void registration_form_test(){
        /*
        1. Open browser
        2. Go to website: https://practice.cydeo.com/registration_form
         */


        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //faker for name
        Faker faker= new Faker();
        //3. Enter first name
        WebElement inputFirstName= Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement inputLastName= Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());
        //5. Enter username
        WebElement userName= Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
      //  userName.sendKeys(faker.name().username().replaceAll(".",""));

        String user= faker.bothify("Username##");
        userName.sendKeys(user);
        //6. Enter email address
        WebElement eMAil= Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        eMAil.sendKeys(faker.letterify("?????@email.com"));
        //7. Enter password
        WebElement password= Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.numerify("########"));

        //8. Enter phone number
        WebElement phoneNumber= Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("571-###-####"));

        //9. Select a gender from radio buttons
        WebElement gender= Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        gender.click();

        //10. Enter date of birth
        WebElement birthday= Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        birthday.sendKeys("01/22/1987");
        //11. Select Department/Office
        Select departmentDropdown= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

        //12. Select Job Title
        Select jobTitle= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,8));

        //13. Select programming language from checkboxes

        WebElement language= Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        language.click();



    }
}
