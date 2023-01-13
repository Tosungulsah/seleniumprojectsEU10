package com.cydeo.tests.day8_WebtablesCont_Properties;

import com.cydeo.tests.utilities.WebDriverFactory;
import com.cydeo.tests.utilities.WebTableUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Task_WithUtility {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }
    @Test
    public void orderDate(){

       String customerOrderDate=  WebTableUtils.returnOrderDate(driver,"Bob Martin");
        System.out.println("customerOrderDate = " + customerOrderDate);
    }
    @Test
    public void test2(){
        String customerDate1= WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("customerDate1 = " + customerDate1);
    }
    @Test
    public void  test3(){
      WebTableUtils.orderVerify(driver,"Bart Fisher","01/16/2021");
    }
}
