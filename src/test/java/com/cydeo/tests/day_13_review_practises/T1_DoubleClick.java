package com.cydeo.tests.day_13_review_practises;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_DoubleClick {
    DoubleClickPage doubleClickPage;
@Test
    public void t1_double_click_test(){

  //  1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
    //WebElement accept= Driver.getDriver().findElement(By.id("accept-choices"));
    //accept.click();
    //BrowserUtils.sleep(10);
    doubleClickPage=new DoubleClickPage();
    doubleClickPage.accept.click();



    // 2. Switch to iframe.
    Driver.getDriver().switchTo().frame("iframeResult");
//3. Double click on the text “Double-click me to change my text color.”
    Actions actions= new Actions(Driver.getDriver());

    actions.doubleClick(doubleClickPage.textToDoubleClick).perform();

// 4. Assert: Text’s “style” attribute value contains “red”.
    BrowserUtils.sleep(10);
    //System.out.println(doubleClickPage.textToDoubleClick.getAttribute("style"));

    Assert.assertTrue(doubleClickPage.textToDoubleClick.getAttribute("style").contains("red"));
}
}
