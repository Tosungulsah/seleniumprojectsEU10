package com.cydeo.tests.day11_Actions_jsexecuter_practise;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Drag_And_Drop {
    /*
    TC #: Drag and drop
1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”

     */
    @Test
    public void dragAndDrop(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptButton= Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptButton.click();

        WebElement smallCircle= Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle= Driver.getDriver().findElement(By.id("droptarget"));

        //2. Drag and drop the small circle to bigger circle.

        Actions actions= new Actions(Driver.getDriver());

        BrowserUtils.sleep(2);
        //actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.clickAndHold(smallCircle)
                .pause(2000)
                .moveToElement(bigCircle)
                .pause(2000)
                .release()
                .perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”

        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText, expectedBigCircleText);
    }




}

