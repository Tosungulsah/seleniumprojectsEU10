package com.cydeo.tests.homeworks;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Evreka {

    @Test

    public void evreka() {
        Driver.getDriver().navigate().to("https://www.amazon.com.tr");

        BrowserUtils.sleep(2);
        WebElement accept = Driver.getDriver().findElement(By.id("sp-cc-accept"));
        accept.click();

        BrowserUtils.sleep(2);
        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iPhone13 512");
        searchBox.sendKeys(Keys.ENTER);

        List<WebElement> results = Driver.getDriver().findElements(By.xpath("//div[@class='a-section a-spacing-base']"));
        if (results.size() > 0) {
            System.out.println("results are listed");

        }else {
            System.out.println("Not listed");
        }
        for (WebElement each : results) {
            System.out.println(each.getText());
        }

    }
}
