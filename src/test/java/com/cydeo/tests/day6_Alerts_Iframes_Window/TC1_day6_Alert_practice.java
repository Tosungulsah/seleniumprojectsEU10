package com.cydeo.tests.day6_Alerts_Iframes_Window;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_day6_Alert_practice {
/*
TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.
 */

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://practice.cydeo.com/javascript_alerts");

    }
    @Test
    public void alert_test_1() throws InterruptedException {
        WebElement clickJSalert= driver.findElement(By.xpath("//Button[.='Click for JS Alert']"));
        clickJSalert.click();

        Thread.sleep(2000);
        Alert alert= driver.switchTo().alert();
        alert.accept();
        WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));

    }
}
