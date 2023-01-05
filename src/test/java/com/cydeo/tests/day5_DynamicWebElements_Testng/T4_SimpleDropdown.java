package com.cydeo.tests.day5_DynamicWebElements_Testng;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdown {
    /*
    1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
     */
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @AfterMethod
        public void tearDownMethod(){
            driver.close();
        }

     //2. Go to https://practice.cydeo.com/dropdown

    @Test
    public void simpleDropdownTest(){
        driver.navigate().to("https://practice.cydeo.com/dropdown");
        //WebElement acceptrules= driver.findElement(By.xpath("//div[@class='QS5gu sy4vM']"));
      //  acceptrules.click();
        Select simpleDropdown= new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption= simpleDropdown.getFirstSelectedOption();
        String actualSimpleDropdowntext= currentlySelectedOption.getText();
        System.out.println(actualSimpleDropdowntext);
        String expectedSimpleDropdowntext= "Please select an option";
        Assert.assertEquals(actualSimpleDropdowntext,expectedSimpleDropdowntext,"Dropdown verification failed");



        //4. Verify “State selection” default selected value is correct
        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        WebElement currentlySelectedOptionState= stateDropdown.getFirstSelectedOption();

        String actualStateDropdownText= currentlySelectedOptionState.getText();
        String expectedStateDropDownText="Select a State";

        Assert.assertEquals(actualStateDropdownText,expectedStateDropDownText,"State dropdown verification failed");



    }



    }

