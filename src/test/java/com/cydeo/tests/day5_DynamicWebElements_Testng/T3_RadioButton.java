package com.cydeo.tests.day5_DynamicWebElements_Testng;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //2. Go to https:practice.cydeo.com/radio_buttons

        driver.navigate().to("https://practice.cydeo.com/radio_buttons");
        //  3. Click to “Hockey”radio button
        //WebElement hockeyBtn= driver.findElement(By.xpath("//input[@id='hockey']"));
        //locate names= sports and store them in list of webelement
/*
       List<WebElement> sportRadioButton= driver.findElements(By.name("sport"));
        // loop through the list of WebElement and select matching result " hockey"
        for (WebElement each : sportRadioButton) {
           String eachId=  each.getAttribute("id");
            System.out.println("eachId = " + eachId);
            if(eachId.equals("hockey")){
                each.click();
                System.out.println("each.isSelected() = " + each.isSelected());
                break;
      */

        clickAndVerifRadioButton(driver,"sport","hockey");

            }







    private static void clickAndVerifRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement>  radioButtons= driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {
            String eachId=  each.getAttribute("id");
            System.out.println("eachId = " + eachId);
            if(eachId.equals(idValue)){
                each.click();
                System.out.println(eachId+ "each.isSelected() = " + each.isSelected());
                break;
            }
        }

    }


}
