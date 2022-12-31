package com.cydeo.tests.day4_FindElements_CheckBox_Radio;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC5_CheckBoxes {
    public static void main(String[] args) {
     //   1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // 2. Confirm checkbox #1 is NOT selected by default
        WebElement firstbox= driver.findElement(By.name("checkbox1"));
         Boolean selected=  firstbox.isSelected();
        System.out.println("First selected: "+selected);
       // 3. Confirm checkbox #2 is SELECTED by default.

        WebElement secondbox= driver.findElement(By.id("box2"));
        System.out.println("secondbox selected= " + secondbox.isSelected());
      //  4. Click checkbox #1 to select it.

        firstbox.click();
       // 5. Click checkbox #2 to deselect it.
        secondbox.click();
        // 6. Confirm checkbox #1 is SELECTED.
        System.out.println("first box selected: "+ firstbox.isSelected());
        //  7. Confirm checkbox #2 is NOT selected.

        System.out.println("second box is selected: "+ secondbox.isSelected());
    }
}
