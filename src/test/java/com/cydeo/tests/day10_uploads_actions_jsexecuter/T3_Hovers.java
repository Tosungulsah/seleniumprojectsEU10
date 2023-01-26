package com.cydeo.tests.day10_uploads_actions_jsexecuter;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Hovers {







//3. Assert:
//a. “name: user1” is displayed
//b. “view profile” is displayed
//4. Hover over to second image
//5. Assert:
//a. “name: user2” is displayed
//b. “view profile” is displayed
//6. Hover over to third image
//7. Confirm:
//a. “name: user3” is displayed
//b. “view profile” is displayed

    // 1. Go to https://practice.cydeo.com/hovers
@Test
    public void hovering_test(){
    Driver.getDriver().get("https://practice.cydeo.com/hovers");

    WebElement image1= Driver.getDriver().findElement(By.xpath("(//img)[1]"));
    WebElement image2= Driver.getDriver().findElement(By.xpath("(//img)[2]"));
    WebElement image3= Driver.getDriver().findElement(By.xpath("(//img)[3]"));

    // locate all displayed names
    WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
    WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
    WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

    Actions actions= new Actions(Driver.getDriver());
    //2. Hover over to first image
    BrowserUtils.sleep(2);
    actions.moveToElement(image1).perform();
    //3. Assert:
    Assert.assertTrue(user1.isDisplayed());

    //4. Hover over to second image
    BrowserUtils.sleep(2);
    actions.moveToElement(image2).perform();
    //5. Assert:
    Assert.assertTrue(user2.isDisplayed());

    //6. Hover over to third image
    BrowserUtils.sleep(2);
    actions.moveToElement(image3).perform();
    //7. Confirm:
    Assert.assertTrue(user3.isDisplayed());







  

}



}
